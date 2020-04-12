package com.victor.learn.kotlin.challenges

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    val finalGrades = arrayListOf<Int>()
    grades.forEach {
        val grade = it
        val nextGradeMultipleOf5 =
            getNextMultipleOf5From(grade)
        if ((nextGradeMultipleOf5 - grade) < 3 && grade >= 38){
            finalGrades.add(nextGradeMultipleOf5)
        } else {
            finalGrades.add(grade)
        }
    }
    return finalGrades.toTypedArray()
}

fun getNextMultipleOf5From(grade: Int): Int{
    var nextGrade = grade
    while (nextGrade % 5 != 0) {
        nextGrade++
    }
    return nextGrade
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))

}