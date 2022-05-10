package com.github.foxmorg.tutorials.springboot.thenewboston.datasource.network.dto

import com.github.foxmorg.tutorials.springboot.thenewboston.model.Bank

data class BankList(
    val results: Collection<Bank>
)