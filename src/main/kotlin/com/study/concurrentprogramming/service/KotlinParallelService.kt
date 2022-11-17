package com.study.concurrentprogramming.service

import com.study.concurrentprogramming.repository.KotlinRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class KotlinParallelService(private val repository: KotlinRepository) {

    @Throws(InterruptedException::class)
    fun findById(id: Int): String? {
        Thread.sleep(2000)
        return ( "\n" + "[" + "Id: " + repository.findById(id).get().id +
                "  ,  Account Owner: " + repository.findById(id).get().accountOwner  +
                "  ,  Payback Value: " + repository.findById(id).get().paybackValue +
                "]" + "\n")
    }
}