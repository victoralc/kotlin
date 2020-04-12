package com.victor.learn.kotlin.learn

fun main() {
    // 5 , 10 , 15, 20 ,25... 5000
//    for(i in 5..5000 step 5) {
//        println(i)
//    }

    //-500, -499, 498 ...0
//    for(i in -500..0) {
//        println(i)
//    }

    //0,1,1,2

    var lastNumber = 0
    var nextNumber = 1
    print("0,")
    for (i in 1..15) {
        val aux = lastNumber
        print("$nextNumber,")
        lastNumber = nextNumber
        nextNumber += aux
    }
}