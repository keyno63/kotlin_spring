package com.who.kotlinspring.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/db")
class DBSampleController {

    @GetMapping("/test")
    fun test(): String {
        return "test"
    }

    @GetMapping("/get")
    fun get(): String {
        throw HttpStatus404Exception("Not implemented now.")
    }
}

@ResponseStatus(value = HttpStatus.NOT_FOUND)
private class HttpStatus404Exception(value: String?) : RuntimeException()
