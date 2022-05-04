package com.github.foxmorg.tutorials.springboot.thenewboston.controller

import com.github.foxmorg.tutorials.springboot.thenewboston.model.Bank
import com.github.foxmorg.tutorials.springboot.thenewboston.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {

    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()
}