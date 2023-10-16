package com.oscarcode10.repasoscar

fun hello(nombre: String){
    println("Hello World")
}

fun add():Array<Double> {
    println("Ingrese el número 1: ")
    val num1:Double= readln().toDouble()
    println("Ingrese el número 2: ")
    val num2:Double= readln().toDouble()
    val result:Double=num1+num2
    println("Sumando los números el resultado es $result")
    println("El resultado de resta es: ${rest(num1, num2)}")
    println("El resultado de la division es: ${div(num1, num2)}")
    println("El número menor es: ${menor(num1, num2)}")
    val numbers=mutableListOf(num1,num2)
    return numbers.toTypedArray()
}

fun rest(num1: Double, num2: Double):Double{
    return num1-num2
}

fun multi(num1: Double, num2: Double):Double{
    return num1*num2
}

fun div(num1: Double, num2: Double):Double{
    return num1/num2
}

fun mayor(){
    fun calcularMajor(num1:Double, num2:Double)= if (num1>num2)num1 else if(num1<num2)num2 else "Son iguales"
    for (i in 1..5){
        println("Ingrese el primer número: ")
        val num1 = readln().toDouble()
        println("Ingrese el primer número: ")
        val num2 = readln().toDouble()
        println("El número mayor es: ${calcularMajor(num1, num2)}")
    }
}

fun main() {
    /*hello("Oscar")
    var arrayNumbers=add()
    println("La multiplicacion es ${multi(arrayNumbers[0], arrayNumbers[1])}")*/
    mayor()
}
fun menor(num1: Double, num2: Double)=if (num1<num2)num1 else if(num1>num2)num2 else "Son iguales"