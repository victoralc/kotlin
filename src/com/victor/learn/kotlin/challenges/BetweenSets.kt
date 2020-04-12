package com.victor.learn.kotlin.challenges

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    
    val range = a.first()..b.last()
    var count = 0
    for (r in range) {
        if (isFactorInA(
                a,
                r
            ) && isFactorInB(b, r)
        ) {
            count++
        }
    }
    
    return count
}

fun isFactorInA(factors: Array<Int>, num: Int): Boolean{

    for (f in factors){
        if (num % f != 0){
            return false
        }
    }
    return true
}

fun isFactorInB(factors: Array<Int>, num: Int): Boolean{

    for (f in factors){
        if (f % num != 0){
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}