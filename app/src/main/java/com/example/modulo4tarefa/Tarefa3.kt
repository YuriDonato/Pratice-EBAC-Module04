package com.example.modulo4tarefa

class Tarefa3 {
}
//Crie uma função calculadora que recebe
//  dois inteiros de parâmetro e um terceiro parâmetro do
//  tipo função. Esta função de parâmetro deve receber dois
//  inteiros de parâmetro e retornar um inteiro
//      Etapa 1 -
//        Teste esta função passando dois inteiros e a função soma
//      Etapa 2 -
//        Teste esta função passando os mesmos números inteiros do teste
//        anterior mas passando a função multiplicação desta vez


fun main(){
   // val funcaoTipo = {numTipo: Int,numtipo2: Int -> println(numTipo/5)}

    //Necessario

    //Etapa 1
    val funcaoSoma = {num1: Int,num2: Int -> println("A soma de $num1 + $num2 = ${num1+num2}")}
    funcaoCalculadora(5,2, funcaoSoma)


    //Etapa 2
    val funcaoMulti = {num1: Int,num2: Int -> println("A multiplicacao de $num1 * $num2 = ${num1+num2}")}
    funcaoCalculadora(5,2,funcaoMulti)

}

//Criar funcao que recebe dois int e uma funcao
fun funcaoCalculadora(num1:Int,num2:Int, funcao: (Int,Int) -> Unit){
    funcao(num1,num2)
}

