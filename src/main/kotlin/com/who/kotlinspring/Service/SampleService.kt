package com.who.kotlinspring.Service

import com.who.kotlinspring.repository.SampleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SampleService(val sr: SampleRepository) {

    fun get(x: String): String {
        return sr.get(x)
    }
}