package com.study.concurrentprogramming.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "PAYBACK")
public class JavaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String accountOwner;
    @Column
    Integer paybackValue;

}
