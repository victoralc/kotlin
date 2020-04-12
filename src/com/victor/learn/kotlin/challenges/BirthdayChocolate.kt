package com.victor.learn.kotlin.challenges

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {

    var count = 0
    var lastSubIndex = m - 1
    
    for ((index) in s.withIndex()) {
        if (s.lastIndex >= lastSubIndex) {
            if (s.slice(index..lastSubIndex).sum() == d) {
                count++
            }
            lastSubIndex++
        }
    }
    return count
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}