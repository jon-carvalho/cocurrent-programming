package com.study.concurrentprogramming.service

import com.study.concurrentprogramming.model.ForAllModel
import com.study.concurrentprogramming.repository.ForAllRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class KotlinImperativeService(private val repository: ForAllRepository) {

    fun findAll(): MutableList<ForAllModel> {
        return repository.findAll()
    }

    fun findById(id: Int): Optional<ForAllModel> {
        return repository.findById(id)
    }
}