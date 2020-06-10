package com.hainh.member_management_system_api.controller

import com.hainh.member_management_system_api.model.Example
import com.hainh.member_management_system_api.contract.service.ExampleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/examples")
class ExampleController(private val exampleService: ExampleService) {

    @GetMapping
    fun index(): List<Example> =
            exampleService.getExamples()

    @PostMapping
    fun store(
            @RequestBody example: Example
    ): ResponseEntity<Example> =
            exampleService.addExample(example)

    @GetMapping("/{id}")
    fun show(
            @PathVariable(value = "id") exampleId: Long
    ): ResponseEntity<Example> =
            exampleService.getExampleById(exampleId)

    @PutMapping("/{id}")
    fun update(
            @PathVariable(value = "id") exampleId: Long,
            @RequestBody newExample: Example
    ): ResponseEntity<Example> =
            exampleService.putExample(exampleId, newExample)

    @DeleteMapping("/{id}")
    fun destroy(
            @PathVariable(value = "id") exampleId: Long
    ): ResponseEntity<Void> =
            exampleService.deleteExample(exampleId)
}
