package com.example.appcurso2023

import java.lang.reflect.Array.getLength

fun main(){


    val weekDays = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    //obtener tamaño de un array
    var tam = getLength(weekDays)
    println(weekDays.size)
    println(weekDays[6])

    //cambiar valores de un array
    weekDays[0]= "Lunes"
    println(weekDays[0])
    //bucles paora arrays
    //forma 1
    for (position in weekDays.indices){
        println(weekDays[position])
    }
    //forma 2
    for ((position,value) in weekDays.withIndex()){
        println("la posicion $position, contiene $value")
    }
    //forma 3
    for (weekDay in weekDays){
        println("Ahora es: $weekDay")
    }


}