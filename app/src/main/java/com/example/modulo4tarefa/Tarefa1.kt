package com.example.modulo4tarefa

class Tarefa1 {
}
//Crie uma função que receba dois números inteiro de
//parâmetro e retorne o resultado da soma
fun main(){
var soma = tarefa1(5,2)
    println("O total da soma é $soma")
}


fun tarefa1(num1: Int, num2: Int) : Int{
    var retornar = num1+num2
    return retornar
}