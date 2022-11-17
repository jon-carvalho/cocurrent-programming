package com.study.concurrentprogramming.controller

import com.study.concurrentprogramming.service.KotlinImperativeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import  kotlin.random.Random
import kotlin.system.measureTimeMillis

@RestController
@RequestMapping("/imperative")
class KotlinImperativeController {

    @Autowired
    lateinit var kotlinImperativeService: KotlinImperativeService

    @GetMapping
    fun getAllValues(): MutableList<String>{
//        val randomNumber = Random.nextInt(1, 15)
        val randomNumber = 10
        var response = mutableListOf<String>()

        val time = measureTimeMillis {

            println()
            println(">>>Starting Kotlin Imperative the requests")
            for (i in 1..randomNumber) {
                response += kotlinImperativeService.findById(i)
            }

        }
        println(response)
        print(">>> Kotlin Imperative requests took " + time + " milliseconds")

        return response

    }
}