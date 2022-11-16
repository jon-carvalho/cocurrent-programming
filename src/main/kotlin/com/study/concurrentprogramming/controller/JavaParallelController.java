package com.study.concurrentprogramming.controller;

import com.study.concurrentprogramming.model.JavaModel;
import com.study.concurrentprogramming.service.JavaParallelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.*;

@Component
@RestController
public class JavaParallelController {

    @Autowired
    JavaParallelService javaParallelService;
    @GetMapping("/parallel")
    public String testJavaParallel() throws ExecutionException, InterruptedException {
//        int randomNumber = (int) ((Math.random() * 14)+1);
        long start = System.currentTimeMillis();
        System.out.println("Starting Java Parallel processing");

        ArrayList processamento = new ArrayList();
        Future<String> futureReturn;
        String showData = "";
        for(int i=0; i<15; i++){
            processamento.add(processingParallel(i));
        }


        for(int i=1; i<=10; i++){
            Future<String> teste = (Future<String>) processamento.get(i);
            showData += teste.get();
        }

        long end = System.currentTimeMillis();
        System.out.println("Processing time: " + (end - start) + "");


        return showData;

    }
    private static final ExecutorService ex = Executors.newCachedThreadPool();
    public Future<String> processingParallel(Integer id) throws InterruptedException {
        Future<String> retorno = ex.submit(
                new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return generatingReturn(id);
                    }
                }
        );
        return retorno;
    }

    public String generatingReturn(Integer id) throws InterruptedException {
        return javaParallelService.findById(id);
    }


}
