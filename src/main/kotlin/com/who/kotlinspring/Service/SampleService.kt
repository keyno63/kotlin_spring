package com.who.kotlinspring.Service

import com.who.kotlinspring.repository.SampleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SampleServiceImpl(val sr: SampleRepository): SampleServiceBase {

    fun get(x: String): String {
        return sr.get(x)
    }

    fun post(x: String): String {
        return sr.post(x)
    }
}