package com.study.concurrentprogramming.controller

import com.study.concurrentprogramming.service.KotlinCoroutineService
import kotlinx.coroutines.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.random.Random
import kotlin.system.measureTimeMillis

@RestController
@RequestMapping("/coroutine")
class KotlinCoroutineController {

    @Autowired
    lateinit var kotlinCoroutineService: KotlinCoroutineService

    @GetMapping
    fun getAllValues(){

        val randomNumber = Random.nextInt(1, 15)
        var response = listOf<String>()

        println("Vão ser feitas " + randomNumber + " requisições")



        CoroutineScope(Dispatchers.IO).launch {
            val time = measureTimeMillis {
                var getting = mutableListOf<Deferred<String>>()

            for (i in 1..randomNumber) {
                getting += mutableListOf( async { kotlinCoroutineService.findById(i)})
                }
                response += getting.awaitAll()


                println(">>>>>>>>>>EXIBINDO LISTA<<<<<<<<<<" )
                    print("" + response + "\n")


            }
            print("A requisição demorou " + time + " milisegundos")
        }


        print(response)
    }
}