package com.victor.learn.kotlin.learn.collections

fun main() {
    val setInts = setOf(10, 15, 5, 3, -22)
    println(setInts.plus(20))
    println(setInts.plus(10))
    println(setInts.plus(19))
    println(setInts.minus(19))
    println(setInts.average())
    println(setInts.drop(19))
    
    val mutableInts = mutableSetOf(1,2,3,4,5)
    mutableInts.plus(10)
    println(mutableInts)
}