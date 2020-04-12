package com.victor.learn.kotlin.challenges

import java.util.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    
    var maxScore = scores[0]
    var minScore = scores[0]
    var highScoreTimes = 0
    var lowerScoreTimes = 0
    
    for (score in scores) {
        if (score > maxScore && score > minScore){
            maxScore = score
            highScoreTimes++
        } else if (score < maxScore && score < minScore) {
            minScore = score
            lowerScoreTimes++
        }
    }
    
    return arrayOf(highScoreTimes, lowerScoreTimes)

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}