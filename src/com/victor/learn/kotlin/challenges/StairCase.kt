package com.victor.learn.kotlin.challenges

import java.util.*

// Complete the staircase function below.
fun staircase(n: Int): Unit {
    var chars = CharArray(n) {i -> ' '}
    for (i in (chars.lastIndex).downTo(0)) {
        chars[i] = '#'
        println(chars)
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}