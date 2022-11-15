package com.study.concurrentprogramming.controller

import com.study.concurrentprogramming.service.KotlinImperativeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import  kotlin.random.Random

@RestController
@RequestMapping("/imperative")
class KotlinImperativeController {

    @Autowired
    lateinit var kotlinImperativeService: KotlinImperativeService

    @GetMapping
    fun getAllValues(){
        val randomNumber = Random.nextInt(1, 15)
        var response = ""

        println("Vão ser feitas " + randomNumber + " requisições")
        println("EXIBINDO LISTA => " )
        for (i in 1..randomNumber){
            response += ( "[" + "\n" +
                    "     " +  "Id: " + kotlinImperativeService.findById(i).get().id + "\n" +
                    "     " +  "Account Owner: " + kotlinImperativeService.findById(i).get().accountOwner + "\n" +
                    "     " +  "Payback Value: " + kotlinImperativeService.findById(i).get().paybackValue + "\n" +
                    "]" + "\n")
        }

        print(response)
    }
}