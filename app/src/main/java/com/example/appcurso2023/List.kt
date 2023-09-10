package com.example.appcurso2023

fun main(){
    inmutableList()
}
fun inmutableList(){
    val readOnly:List<String> = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    //println(readOnly.size)
    //println(readOnly)
    //println(readOnly[0])
    //println(readOnly.last())
    //println(readOnly.first())

    val example = readOnly.filter { it.contains("i") }
    //println(example)
    readOnly.forEach { weekDay ->println(weekDay)}

}