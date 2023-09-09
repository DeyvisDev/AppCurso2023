package com.example.appcurso2023

fun main(){
    getMonth(10)
    getTrimestre(4)
}
fun getMonth(month:Int){
    when(month){
        1-> println("Enero")
        2-> println("Febrero")
        3-> println("Marzo")
        4-> println("Abril")
        4-> println("Mayo")
        6-> println("Junio")
        7-> println("Julio")
        8-> println("Agosto")
        9-> println("septiembre")
        10-> println("Octubre")
        11-> println("Noviembre")
        12-> {
            println("Diciembre")
            println("Diciembre")
            //para mas lineas de codigo
        }
        else -> println("No es un mes valido")
    }
}
fun getTrimestre(month: Int){
    when(month){
        1,2,3-> println("Primer Trimestre")
        4,5,6-> println("Segundo Trimestre")
        7,8,9-> println("Tercer Trimestre")
        10,11,12-> println("Cuarto Trimestre")
        else -> println("No es un trimestre valido")
    }
}