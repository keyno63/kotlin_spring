package com.who.kotlinspring.firstApp.controller

import com.who.kotlinspring.firstApp.Service.SampleService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/db")
class DBSampleController(val sb: SampleService) {

    @GetMapping("/test")
    fun test(): String {
        return "test"
    }

    @GetMapping("/get")
    fun get(): String {
        return sb.get("Hello Worlds.")
    }

    @PostMapping("/post")
    fun post(): String {
        throw HttpStatus404Exception("Not implemented now.")
    }
}

@ResponseStatus(value = HttpStatus.NOT_FOUND)
private class HttpStatus404Exception(value: String?) : RuntimeException()
