package com.victor.learn.kotlin.challenges

import java.util.*
import kotlin.math.abs

// Complete the kangaroo function below.
fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {

    val iguais = (x1 + v1) == (x2 + v2)

    val x1NaFrenteEPulaMais = (x1>x2) && (v1>v2)
    
    val x2NaFrenteEPulaMais = (x2>x1) && (v2>v1)
    

    if (iguais) {
        return "YES"
    } else if (x2NaFrenteEPulaMais || x1NaFrenteEPulaMais) {
        return "NO"
    } else {
        return "NO"
    }

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val x1V1X2V2 = scan.nextLine().split(" ")

    val x1 = x1V1X2V2[0].trim().toInt()

    val v1 = x1V1X2V2[1].trim().toInt()

    val x2 = x1V1X2V2[2].trim().toInt()

    val v2 = x1V1X2V2[3].trim().toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}