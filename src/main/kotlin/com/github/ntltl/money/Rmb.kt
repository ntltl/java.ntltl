@file:JvmName("Rmb")

package com.github.ntltl.money

import java.math.BigDecimal

typealias Rmb = BigDecimal

fun Rmb.sum(vararg rmbs: Rmb): Rmb {
    var sum = Rmb.ZERO;
    for (rmb in rmbs) {
        sum += rmb
    }
    return sum
}
