package com.who.kotlinspring.repository;

import org.springframework.stereotype.Repository

@Repository
class SampleRepositoryImpl: SampleRepository {
    fun get(x: String): String {
        return ""
    }

    fun post(x: String): String {
        return ""
    }

}
