package com.victor.learn.kotlin.challenges

import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    /*
     * Write your code here.
     */
    val hoursMap = mapOf(
        "01" to "13",
        "02" to "14",
        "03" to "15",
        "04" to "16",
        "05" to "17",
        "06" to "18",
        "07" to "19",
        "08" to "20",
        "09" to "21",
        "10" to "22",
        "11" to "23",
        "12" to "12")

    val hour = s.substring(0..1)
    return if(s.contains(Regex("((AM)|(am))"))){
        if (hour == "12") {
            s.replaceBefore(":", "00").replace(Regex("((AM)|(am))"), "")
        }else {
            s.replace(Regex("((AM)|(am))"), "")
        }
    } else {
        var hour24 = hoursMap[hour] ?: error("No hour equivalent found")
        s.replaceBefore(":", hour24).replace(Regex("((PM)|(pm))"), "")
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}