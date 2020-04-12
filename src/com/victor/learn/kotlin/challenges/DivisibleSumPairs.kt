package com.victor.learn.kotlin.challenges

import java.util.*

// Complete the divisibleSumPairs function below.
fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {

    var count = 0   
    for ((index, number) in ar.withIndex()) {
        for (subNumber in ar.slice((index+1)..ar.lastIndex)) {
            if (((number+subNumber)%k== 0)) {
                count++
            }
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = divisibleSumPairs(n, k, ar)

    println(result)
}
