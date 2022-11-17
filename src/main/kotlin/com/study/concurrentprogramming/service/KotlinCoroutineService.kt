package com.study.concurrentprogramming.service

import com.study.concurrentprogramming.repository.KotlinRepository
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Service

@Service
class KotlinCoroutineService(private val repository: KotlinRepository) {

    fun findById(id: Int): String {
        runBlocking {
            delay(2000)
        }
        return ( "\n[" + "Id: " + repository.findById(id).get().id +
                        "  ,  Account Owner: " + repository.findById(id).get().accountOwner  +
                        "  ,  Payback Value: " + repository.findById(id).get().paybackValue +
                "]" + "\n")
    }
}