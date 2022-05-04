package com.github.foxmorg.tutorials.springboot.thenewboston.service

import com.github.foxmorg.tutorials.springboot.thenewboston.datasource.BankDataSource
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)

    private val bankService: BankService = BankService(dataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // given
        // mockk(relaxed = true) or this one:
//        every { dataSource.retrieveBanks() } returns emptyList()

        // when
        val banks = bankService.getBanks()

        // then
        verify(exactly = 1) { dataSource.retrieveBanks() }

    }


}