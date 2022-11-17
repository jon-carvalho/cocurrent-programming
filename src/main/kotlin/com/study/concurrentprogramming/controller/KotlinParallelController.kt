package com.study.concurrentprogramming.controller

import com.study.concurrentprogramming.service.KotlinParallelService
import kotlinx.coroutines.handleCoroutineException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.*

@RestController
@RequestMapping("/parallel")
class KotlinParallelController {

    @Autowired
    lateinit var kotlinParallelService: KotlinParallelService

    @GetMapping
    @Throws(ExecutionException::class, InterruptedException::class)
    fun getAllValue(): MutableList<String> {
//        int randomNumber = (int) ((Math.random() * 14)+1);
        val randomNumber=10
        val start = System.currentTimeMillis()

        println()
        println(">>>Starting Kotlin Future requests")
        val processamento: ArrayList<Future<String>?> = ArrayList()
        var response = mutableListOf<String>()
        for (i in 0..randomNumber) {
            processamento.add(processingParallel(i))
        }
        for (i in 1..randomNumber) {
            val teste = processamento[i] as Future<String>
            response += teste.get()
        }
        val end = System.currentTimeMillis()

        print(response)
        println(">>> Kotlin Future request took " + (end - start) + " milliseconds")

        return response

    }

    private val ex = Executors.newCachedThreadPool()

    @Throws(InterruptedException::class)
    fun processingParallel(id: Int): Future<String>? {
        return ex.submit( Callable {
                generatingReturn(id)
        })
    }

    @Throws(InterruptedException::class)
    fun generatingReturn(id: Int): String? {
        return kotlinParallelService.findById(id)
    }
}