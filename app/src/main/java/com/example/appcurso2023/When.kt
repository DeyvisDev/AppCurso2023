package com.example.appcurso2023

fun main(){
    result(true)
}
fun result(value:Any){
    when (value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if (value) println("YIYiS")
    }
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
fun getTSemestre(month: Int):String{
    return when(month){
        in 1..6-> "Primer Semestre"
        in 7..12->  "Segundo Semestre"
        !in 1..12 ->  "Semestre no valido"
        else -> "No se sabe"
    }

}