package com.study.concurrentprogramming.unityTests

import com.study.concurrentprogramming.controller.KotlinParallelController
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.SpyBean

@SpringBootTest
class KotlinFutureTest {

    @SpyBean
    lateinit var kotlinParallelController: KotlinParallelController


    @Test
    fun doSomeTest() {

        val getting = kotlinParallelController.getAllValue()

        var pos0 = "\n" +"[Id: 1  ,  Account Owner: JONATAS  ,  Payback Value: 20]" + "\n"
        var pos5 = "\n" +"[Id: 6  ,  Account Owner: DAEMON  ,  Payback Value: 3]" + "\n"
        var pos9 = "\n" +"[Id: 10  ,  Account Owner: FERNANDA  ,  Payback Value: 65]" + "\n"

        assertNotNull(getting)
        assertEquals(pos0 , getting.get(0))
        assertEquals(pos5 , getting.get(5))
        assertEquals(pos9 , getting.get(9))
    }

}