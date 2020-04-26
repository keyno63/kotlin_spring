package com.who.kotlinspring.repository

import org.springframework.stereotype.Repository

@Repository
class SampleRepositoryImpl: SampleRepository {
    override fun get(x: String): String {
        return x
    }

    override fun post(x: String): String {
        return ""
    }

}
