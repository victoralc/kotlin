package com.victor.learn.kotlin.challenges

import java.util.*

fun plusMinus(arr: Array<Int>): Unit {

    val positives = arr.filter { it > 0 }
    val negatives = arr.filter { it < 0 }
    val zeros = arr.filter { it == 0 }

    println("%.6f".format(positives.size.toFloat()/arr.size))
    println("%.6f".format(negatives.size.toFloat()/arr.size))
    println("%.6f".format(zeros.size.toFloat()/arr.size))

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}