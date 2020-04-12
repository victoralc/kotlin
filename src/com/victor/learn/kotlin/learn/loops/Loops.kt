package com.victor.learn.kotlin.learn.loops

fun main() {

    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("TRGJIDAMNCHS" in stringRange)
    println("ZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = backwardRange.reversed()

    val seasons = arrayOf("spring", "summer", "fall", "winter")
    for (season in seasons) {
        println(season)
    }

    seasons.forEachIndexed { index, value -> println("Index: $index, Value: $value") }

}