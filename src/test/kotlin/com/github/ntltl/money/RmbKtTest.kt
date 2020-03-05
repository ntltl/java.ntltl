package com.github.ntltl.money

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RmbKtTest {

    @Test
    fun sum() {
        val mine = Rmb("100.00")
        val yours = Rmb("50.00")
        val his = Rmb("1.23")
        val hers = Rmb("47.37")

        assertEquals(Rmb("198.60"), mine.sum(mine, yours, his, hers))

        val ours = arrayOf(mine, yours, his, hers)
        assertEquals(Rmb("198.60"), mine.sum(*ours))

        assertEquals(Rmb("150.00"), mine + yours)
        assertEquals(Rmb("150.00"), mine.add(yours))
    }
}