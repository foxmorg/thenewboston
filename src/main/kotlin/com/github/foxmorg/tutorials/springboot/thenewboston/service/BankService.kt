package com.github.foxmorg.tutorials.springboot.thenewboston.service

import com.github.foxmorg.tutorials.springboot.thenewboston.datasource.BankDataSource
import com.github.foxmorg.tutorials.springboot.thenewboston.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
    fun addBank(bank: Bank): Bank = dataSource.createBank(bank)

}