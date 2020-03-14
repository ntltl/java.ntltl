package com.github.ntltl.dsl.sql

import com.github.ntltl.dsl.sql.sql
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SqlKtTest {

    @Test
    fun sqlTest() {
        val result = sql {
            table("user") {
                join("info")
            }
        }

        assertEquals("from user join info", result)
    }
}