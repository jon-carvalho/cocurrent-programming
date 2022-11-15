package com.study.concurrentprogramming.repository;

import com.study.concurrentprogramming.model.JavaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JavaRepository  extends JpaRepository<JavaModel, Integer> {

    @Override
    Optional<JavaModel> findById(Integer integer);
}
