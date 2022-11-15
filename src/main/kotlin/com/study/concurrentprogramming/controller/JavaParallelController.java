package com.study.concurrentprogramming.controller;

import com.study.concurrentprogramming.model.JavaModel;
import com.study.concurrentprogramming.service.JavaParallelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/parallel")
public class JavaParallelController {


    @Autowired
    JavaParallelService javaParallelService;

    @GetMapping
    public Optional<JavaModel> getAllValues() {
//        int randomNumber = (int) ((Math.random() * (15 - 1)) + 1);
//        System.out.println("randomico " + randomNumber);

        return javaParallelService.findById(1);

    }

}
