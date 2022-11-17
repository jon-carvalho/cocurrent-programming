package com.study.concurrentprogramming.controller

import com.study.concurrentprogramming.service.KotlinCoroutineService
import kotlinx.coroutines.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.system.measureTimeMillis

@RestController
@RequestMapping("/coroutine")
class KotlinCoroutineController {

    @Autowired
    lateinit var kotlinCoroutineService: KotlinCoroutineService

    @GetMapping
    fun getAllValues(): MutableList<String>{
//        val randomNumber = Random.nextInt(1, 15)
        val randomNumber = 10
        val response = mutableListOf<String>()


        CoroutineScope(Dispatchers.IO).launch {
            val time = measureTimeMillis {
            val getting = mutableListOf<Deferred<String>>()

            println()
            println(">>>Starting Kotlin Coroutine the request")
            for (i in 1..randomNumber) {
                getting += mutableListOf( async { kotlinCoroutineService.findById(i)})
                }
                response += getting.awaitAll()

                    print("" + response + "\n")


            }
            print(">>> Kotlin Coroutine request took " + time + " milliseconds")
        }


        print(response)

        return response
    }

    fun getSomething(): String {
        return "deu bom"
    }
}