package com.hainh.member_management_system_api.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class AuthController {

    @PostMapping("login")
    fun login() {

    }
}
