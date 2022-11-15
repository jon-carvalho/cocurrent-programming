package com.study.concurrentprogramming.service;

import com.study.concurrentprogramming.model.JavaModel;
import com.study.concurrentprogramming.repository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JavaParallelService {

    @Autowired
    private JavaRepository javaRepository;

    public Optional<JavaModel> findById(Integer id) {
        return javaRepository.findById(id);
    }

}
