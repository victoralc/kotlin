package com.victor.learn.kotlin.challenges

import java.util.*

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {
    val range = s..t
    
    println(distances(apples, a).filter { range.contains(it) }.count())
    println(distances(oranges, b).filter { range.contains(it) }.count())
}

private fun distances(from: Array<Int>, to: Int): MutableList<Int> {
    val distances = mutableListOf<Int>()
    from.forEach {
        distances.add(to + it)
    }
    return distances
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val apples = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val oranges = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}