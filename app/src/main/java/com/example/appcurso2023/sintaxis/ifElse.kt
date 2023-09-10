package com.example.appcurso2023

fun main(){
    ifBasico()
}
fun ifBasico()
{
    var name = "david"
    if(name == "jose"){
        println("El nombre no es jose")
    }else if(name == "juan"){
        println("el nombrte no es juan")
    }else{
        println("El nombre si es david")
    }
}
fun ifBoolean(){
    var imhappy = true
    //sin nada es true
    //con ! al inicio es false
    if (imhappy){
        println("soy feliz")
    }
}