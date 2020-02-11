package com.who.kotlinspring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
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

        throw NotImplementedError("Not Implememted now.")
        return ""
    }
}