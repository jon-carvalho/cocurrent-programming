package com.study.concurrentprogramming.model

import javax.persistence.*

@Entity
@Table(name = "PAYBACK")
data class KotlinModel (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int,
    @Column
    var accountOwner: String,
    @Column
    var paybackValue: Int
)