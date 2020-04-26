package com.who.kotlinspring.repository

interface SampleRepository {
    fun get(x: String): String
    fun post(x: String): String
}