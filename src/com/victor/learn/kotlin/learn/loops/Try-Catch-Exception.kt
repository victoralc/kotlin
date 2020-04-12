package com.victor.learn.kotlin.learn.loops

import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val number = "21.1"
    println(getNumber(number) ?: "Something wrong occurred!")
}

fun getNumber(number: String): Int? {
    return try {
        Integer.parseInt(number)
    } catch (e: NumberFormatException){
        null
    } finally {
        println("I'm in the finally block!")
    }
}
