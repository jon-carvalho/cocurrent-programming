package com.study.concurrentprogramming.repository

import com.study.concurrentprogramming.model.KotlinModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface KotlinRepository: JpaRepository<KotlinModel, Int> {


    override fun findById(id: Int): Optional<KotlinModel>
}