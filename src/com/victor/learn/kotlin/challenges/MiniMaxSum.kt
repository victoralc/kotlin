package com.victor.learn.kotlin.challenges

import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {

    arr.sort()

    var maxSum: Long = 0
    var minSum: Long = 0

    arr.copyOfRange(0, arr.lastIndex).forEach { minSum += it }
    arr.copyOfRange(1, arr.size).forEach { maxSum += it }

    print("$minSum $maxSum")

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}