package com.who.kotlinspring.firstApp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    @GetMapping("")
    fun hello(): String {
        return "hello"
    }

    @GetMapping("/name")
    fun string(name: String): String {
        return "Hello! $name"
    }

    @PostMapping("/name")
    fun stringPost(name: String): String {
        return "Hello! $name from post."
    }
}
