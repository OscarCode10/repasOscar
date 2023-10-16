package com.oscarcode10.repasoscar

fun salaries(){
    val salaries: DoubleArray
    salaries = DoubleArray(5)
    for(i in 0..4){
        println("Ingrese el salario")
        salaries[i] = readln().toDouble()
    }
    salaries.sort()
    for(i in 0..4){
        println(salaries[i])
    }
}

fun main() {
    salaries()
}
