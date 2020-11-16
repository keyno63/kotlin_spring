package com.who.kotlinspring.firstApp.Service

import com.who.kotlinspring.firstApp.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
class SampleServiceImpl(val sr: SampleRepository): SampleService {

    override fun get(x: String): String {
        return sr.get(x)
    }

    override fun post(x: String): String {
        return sr.post(x)
    }
}