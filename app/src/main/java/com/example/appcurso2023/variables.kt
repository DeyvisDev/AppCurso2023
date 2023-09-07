package com.example.appcurso2023
//VARIABLES

fun main(){

    //edad(25)
    var nombre:String = "Deyvis"
    mostrarminombre(nombre)
    showMyAge(25)
    val resta = subtrak(40,20)
    val suma = add(15,5)
    print(resta.toString() +" "+ suma.toString())

}
fun add(n1:Int,n2:Int):Int{
    var suma = n1+n2
    return suma
}
fun subtrak(n1:Int,n2:Int):Int{
    return n1-n2

}
fun showMyAge(age:Int) {
    println("My age is $age")
}
fun mostrarminombre(nombre:String){
    println("My name is $nombre")
}
fun edad(int: Int){
    print(int)
}
fun variables(){
    val name = "DeyvisDev"
    //variables numericas
    //int
    val number:Int = 3424
    //long
    val age: Long = 2523323232131
    //float
    val floatEjemploDeUnFlotante:Float = 30.5f
    //double
    val double:Double = 3434.4342

    //variables alfanumericas
    //char
    val charExample1:Char = 'e'
    val charExample2:Char = '1'
    val charExample3:Char = '#'
    //String
    val stringExample:String = "saseeee "
    //Variables boleanas
    //boolean
    val boleanExamples:Boolean = true

    var a = 20
    var b = 10
}
