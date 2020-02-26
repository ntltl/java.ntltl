package com.github.ntltl.money

import java.math.BigDecimal
import java.math.BigInteger

class Rmb : BigDecimal {

    constructor(`val` : String?) : super(`val`)
    constructor(`val` : Double) : super(`val`)
    constructor(`val` : BigInteger?) : super(`val`)
    constructor(`val` : Int) : super(`val`)
    constructor(`val` : Long) : super(`val`)

    override fun toString(): String {
        return "Rmb:${super.toString()}"
    }

    override fun toByte(): Byte {
        TODO("not implemented")
    }

    override fun toChar(): Char {
        TODO("not implemented")
    }

    override fun toShort(): Short {
        TODO("not implemented")
    }
}