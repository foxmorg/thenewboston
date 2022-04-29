package com.github.foxmorg.tutorials.springboot.thenewboston.datasource

import com.github.foxmorg.tutorials.springboot.thenewboston.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}