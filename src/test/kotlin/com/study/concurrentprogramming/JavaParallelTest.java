package com.study.concurrentprogramming;

import com.study.concurrentprogramming.controller.JavaParallelController;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertSame;

public class JavaParallelTest {

//    private JavaParallelController javaParallelController;

    @Test
    public void doSomeTest() throws ExecutionException, InterruptedException {

        String getting = "ola";
        String test = "ola";

        assertSame(getting, test);

    }
}
