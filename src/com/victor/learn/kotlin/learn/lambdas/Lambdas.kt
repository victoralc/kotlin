package com.victor.learn.kotlin.learn.lambdas

fun main(args: Array<String>) {
    //run { println("This is a lambda block!") }

    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("John", "McCart Ferrari", 2010),
        Employee("Carlos", "Victor", 2013))

    findByLastName(employees, "Smith")
    findByLastName(employees, "Alcantara")

}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach {
        if (it.lastName == lastName){
            println("Yes, there is an employee with $lastName")
            return
        }
    }
    println("There is no employee with $lastName")
}

//fun findByLastName(employees: List<Employee>, lastName: String) {
//    for (employee in employees){
//        if (employee.lastName == lastName){
//            println("Yes, there is an employee with $lastName")
//            return
//        }
//    }
//
//    println("There is no employee with $lastName")
//}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)