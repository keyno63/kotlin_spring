package com.who.kotlinspring.firstApp.repository

interface SampleRepository {
    fun get(x: String): String
    fun post(x: String): String
}