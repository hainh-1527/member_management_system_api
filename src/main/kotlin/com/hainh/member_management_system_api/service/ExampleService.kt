package com.hainh.member_management_system_api.service

import com.hainh.member_management_system_api.model.Example
import com.hainh.member_management_system_api.contract.repository.ExampleRepository
import com.hainh.member_management_system_api.contract.service.ExampleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class ExampleService(private val exampleRepository: ExampleRepository) : ExampleService {

    override fun getExamples(): List<Example> =
            exampleRepository.findAll()

    override fun addExample(
            example: Example
    ): ResponseEntity<Example> =
            ResponseEntity.ok(exampleRepository.save(example))

    override fun getExampleById(
            exampleId: Long
    ): ResponseEntity<Example> =
            exampleRepository.findById(exampleId).map { example ->
                ResponseEntity.ok(example)
            }.orElse(ResponseEntity.notFound().build())

    override fun putExample(
            exampleId: Long,
            newExample: Example
    ): ResponseEntity<Example> =
            exampleRepository.findById(exampleId).map { currentExample ->
                val updatedExample: Example =
                        currentExample
                                .copy(
                                        title = newExample.title,
                                        date = newExample.date,
                                        status = newExample.status,
                                        description = newExample.description
                                )
                ResponseEntity.ok().body(exampleRepository.save(updatedExample))
            }.orElse(ResponseEntity.notFound().build())

    override fun deleteExample(
            exampleId: Long
    ): ResponseEntity<Void> =
            exampleRepository.findById(exampleId).map { example ->
                exampleRepository.delete(example)
                ResponseEntity<Void>(HttpStatus.ACCEPTED)
            }.orElse(ResponseEntity.notFound().build())
}
