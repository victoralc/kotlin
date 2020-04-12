package com.victor.learn.kotlin.learn.collections

fun main() {
    val strings = listOf("spring", "summer", "summer", "fall", "winter")
    val colors = arrayOf("black", "white", "green", "red", "green")
    
    println(strings.last())

    println(strings.asReversed())

    println(strings.getOrNull(5))
    
    val ints = listOf(1,2,3,4,5)
    println(ints.max())
    
    // merged lists
    println(colors.zip(strings))

    val mergedLists = listOf(colors, strings)
    println(mergedLists)
    
    val combinedList = colors + strings
    println(combinedList)
    
    val noDupsList = colors.union(strings)
    println(noDupsList)
    
    val noDupColors = colors.distinct()
    println(noDupColors)
    
    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other seasons")
    println(mutableSeasons)
}