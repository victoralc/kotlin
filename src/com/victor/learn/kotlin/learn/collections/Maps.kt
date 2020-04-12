package com.victor.learn.kotlin.learn.collections

fun main() {
    val immutableMap = mapOf<Int,Car>(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013))
    
    println(immutableMap.javaClass)
    println(immutableMap)

    val cars = hashMapOf<String,Car>(
        "Victor's car" to Car("green", "Toyota", 2015),
        "Victor's car" to Car("red", "Ferrari", 2020))

    println(cars.javaClass)
    println(cars)
    cars.put("Rose car", Car("red", "Ferrari", 2020))
    println(cars)
    
    for ((key, value) in cars) {
        println(key)
        println(value)
    }
    
    val pair = Pair(10, "ten")
    
    val (firstValue, secondValue) = pair
    println(firstValue)
    println(secondValue)
    
    val car = Car("red", "Ferrari", 2020)
    val (color, model, year) = car //using component class
    println("Color: $color, Model: $model, Year: $year")
    
    println(cars.map { it.value.year })
    println(cars.count { it.value.year > 2014})
}

//data classes uses component() operator out of the box
data class Car(val color: String, val model: String, val year: Int)