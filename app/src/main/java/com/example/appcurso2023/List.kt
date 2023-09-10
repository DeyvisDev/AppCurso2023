package com.example.appcurso2023

import kotlinx.coroutines.processNextEventInCurrentThread

fun main(){
    mutableList()
}
fun inmutableList(){
    val readOnly:List<String> = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    //println(readOnly.size)
    //println(readOnly)
    //println(readOnly[0])
    //println(readOnly.last())
    //println(readOnly.first())


    //filtar
    val example = readOnly.filter { it.contains("i") }
    //println(example)
    //iterar
    readOnly.forEach { weekDay ->println(weekDay)}
}
fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    println(weekDays)

    //añadimos al final
    weekDays.add("diaExtra")
    println(weekDays)

    //añadir segun el indice
    weekDays.add(0,"deyvisdev")
    println(weekDays)

    //ver si esta vacia la lista
    if (weekDays.isEmpty()){
        //no se hace nada
    }else  {
        weekDays.forEach{ println(it)}
    }
    //otra forma

    if (weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }

    //mostrar ultomo
    weekDays.last()

    //fors
    //for normal
    for (item in weekDays){
        println(item)
    }
    weekDays.add("dianavidad")
    //for facil
    weekDays.forEach{
        println(it)
    }
}