package com.victor.learn.kotlin.learn.collections

fun main() {
    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)
    
    val emptyList = emptyList<String>()
    println(emptyList.javaClass)
    
    if (!emptyList.isEmpty()) {
        println(emptyList[0])
    }
    
    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)
    
    // Array List
    val arrayList = arrayListOf(1,2,4)
    println(arrayList.javaClass)
    
    val mutableList = mutableListOf(1,2,3)
    println(mutableList.javaClass)
    
    println(mutableList[2])
    mutableList[1] = 20
    println(mutableList)
    
    val array = arrayOf("black", "white", "green")
    val colorList = array.toList()
    println(colorList)
    
    val ints = intArrayOf(1,2,3)
    println(ints.toList())
    
}