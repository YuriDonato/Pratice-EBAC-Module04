package com.example.modulo4tarefa

class Tarefa2 {
}
//Crie uma função compacta que receba dois números inteiro de
//parâmetro e retorne o resultado da soma

fun main(){
    //var num1 = 5; var num2 = 2 <--- Declaracao de variavel da segunda forma
    var soma = tarefa2(5,2)
    //var soma = tarefa2(num1,num2)    <--- Segunda forma possivel
    println("O total da soma na funcao de parametros é $soma")
}
//Funcao Compacta
fun tarefa2(num1: Int, num2: Int) = num1+num2