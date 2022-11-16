package com.study.concurrentprogramming.service

import com.study.concurrentprogramming.model.ForAllModel
import com.study.concurrentprogramming.repository.ForAllRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Service
import java.util.*
import java.util.concurrent.TimeUnit

@Service
class KotlinCoroutineService(private val repository: ForAllRepository) {

    fun findById(id: Int): String {
        runBlocking {
            delay(2000)
        }
        return ( "[" + "\n" +
                "     " +  "Id: " + repository.findById(id).get().id + "\n" +
                "     " +  "Account Owner: " + repository.findById(id).get().accountOwner + "\n" +
                "     " +  "Payback Value: " + repository.findById(id).get().paybackValue + "\n" +
                "]" + "\n")
    }
}