package com.study.concurrentprogramming.unityTests

import com.study.concurrentprogramming.controller.KotlinCoroutineController
import kotlinx.coroutines.Dispatchers
import org.aspectj.lang.annotation.Before
import org.junit.jupiter.api.Test
import org.springframework.boot.test.mock.mockito.SpyBean
import kotlinx.coroutines.*
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KotlinCoroutinesTest {

    @SpyBean
    lateinit var kotlinCoroutineController: KotlinCoroutineController



    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun doSomeTest() = runTest {


//        advanceUntilIdle()

        var pos0 = "\n" +"[Id: 1  ,  Account Owner: JONATAS  ,  Payback Value: 20]" + "\n"

        val teste = launch {
            val getting =  kotlinCoroutineController.getAllValues()

            assertEquals(pos0, getting.get(0))
        }




//        teste.isCompleted
//        assertEquals(pos0, teste.isCompleted)


    }
}