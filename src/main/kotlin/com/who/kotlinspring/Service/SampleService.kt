package com.who.kotlinspring.Service

import com.who.kotlinspring.repository.SampleRepository
import org.springframework.stereotype.Service

@Service
class SampleService(sr: SampleRepository) {
}