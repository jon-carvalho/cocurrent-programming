package com.study.concurrentprogramming.service

import com.study.concurrentprogramming.model.ForAllModel
import com.study.concurrentprogramming.repository.ForAllRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class KotlinImperativeService(private val repository: ForAllRepository) {

    fun findById(id: Int): String {

        return ( "[" + "\n" +
                "     " +  "Id: " + repository.findById(id).get().id + "\n" +
                "     " +  "Account Owner: " + repository.findById(id).get().accountOwner + "\n" +
                "     " +  "Payback Value: " + repository.findById(id).get().paybackValue + "\n" +
                "]" + "\n")
    }
}