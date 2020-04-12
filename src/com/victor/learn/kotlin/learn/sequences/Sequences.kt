package com.victor.learn.kotlin.learn.sequences

import com.victor.learn.kotlin.learn.collections.Car

fun main() {
    val immutableMap = mapOf<Int, Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        4 to Car("white", "BMW ", 2020),
        8 to Car("black", "Ford", 2019)
    )

    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color })
}