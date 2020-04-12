package com.victor.learn.kotlin.learn.loops

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main(args: Array<String>) {
    val num = 300
    when(num) {
        in 100..900 -> println("range 100...900")
        200 -> println("200")
        300 -> println("300")
        else -> println("Doesn't match anything")
    }

    val seasons = Season.SUMMER
    when(seasons) {
        Season.SUMMER -> println("Summer is shine!")
        Season.SPRING -> println("Spring is beautiful!")
        Season.FALL -> println("Fall is ugly!")
        Season.WINTER -> println("Winter is cold")
    }

}