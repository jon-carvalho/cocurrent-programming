package com.study.concurrentprogramming.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        JavaModel javaModel = (JavaModel) o;
        return id != null && Objects.equals(id, javaModel.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
