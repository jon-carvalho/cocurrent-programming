package com.study.concurrentprogramming

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ConcurrentProgrammingApplication

fun main(args: Array<String>) {
	runApplication<ConcurrentProgrammingApplication>(*args)
}
