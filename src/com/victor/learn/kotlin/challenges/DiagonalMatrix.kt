package com.victor.learn.kotlin.challenges

fun main(args: Array<String>) {
    val numberRows: Int? = readLine()?.toInt()

    val range = 0 until (numberRows!!)

    val matrix = mutableListOf<IntArray>()
    for (num in range){
        val line: IntArray? = readLine()?.split(" ")?.filter { it.isNotBlank() }?.map { it -> it.toInt() }?.toIntArray()
        if (line != null) {
            matrix.add(line)
        }
    }

    var diagonalPrincipal = 0
    var diagonalSecundaria = 0
    for (n in range) {
        diagonalPrincipal += matrix[n][n]
        diagonalSecundaria += matrix[n][-n+2]
    }

}
