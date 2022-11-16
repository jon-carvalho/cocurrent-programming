package com.study.concurrentprogramming.service;

import com.study.concurrentprogramming.model.ForAllModel;
import com.study.concurrentprogramming.model.JavaModel;
import com.study.concurrentprogramming.repository.ForAllRepository;
import com.study.concurrentprogramming.repository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JavaParallelService {

    @Autowired
    private JavaRepository javaRepository;

    @Autowired
    private ForAllRepository forAllRepository;

    public String findById(Integer id) throws InterruptedException {
        Thread.sleep(2000);
        return ( "[" + "\n" +
                "     " +  "Id: " + forAllRepository.findById(id).get().getId()+ "\n" +
                "     " +  "Account Owner: " + forAllRepository.findById(id).get().getAccountOwner() + "\n" +
                "     " +  "Payback Value: " + forAllRepository.findById(id).get().getPaybackValue() + "\n" +
                "]" + "\n");
    }

}
