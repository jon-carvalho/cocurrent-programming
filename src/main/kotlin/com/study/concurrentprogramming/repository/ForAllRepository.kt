package com.study.concurrentprogramming.repository

import com.study.concurrentprogramming.model.ForAllModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ForAllRepository: JpaRepository<ForAllModel, Int> {

    override fun findAll(): MutableList<ForAllModel>

    override fun findById(id: Int): Optional<ForAllModel>
}