package com.hainh.member_management_system_api.contract.service

import com.hainh.member_management_system_api.model.Example
import org.springframework.http.ResponseEntity

interface ExampleService {
    fun getExamples(): List<Example>

    fun addExample(example: Example): ResponseEntity<Example>

    fun getExampleById(exampleId: Long): ResponseEntity<Example>

    fun putExample(exampleId: Long, newExample: Example): ResponseEntity<Example>

    fun deleteExample(exampleId: Long): ResponseEntity<Void>
}
