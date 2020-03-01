package com.who.kotlinspring.repository

import org.springframework.stereotype.Repository

@Repository
interface SampleRepository {
    fun get(x: String): String
    fun post(x: String): String
}