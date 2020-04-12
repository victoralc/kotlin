package com.victor.learn.kotlin.learn

import java.math.BigDecimal

fun main() {
    
    val list = mutableListOf("Hello")
    list.add("another string")
    list.printCollection()
    list[0].toUpperCase()
    
    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(14.56), BigDecimal(23))
    bdList.printCollection()
}

fun <T> List<T>.printCollection(){
    for (item in this) {
        println(item)
    }
}