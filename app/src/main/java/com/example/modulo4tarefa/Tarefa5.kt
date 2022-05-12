package com.example.modulo4tarefa

class Tarefa5 {
}
//Crie uma lista de string com 4 nomes
//  Etapa 1 -
//      Utilizando o operador map concatene a string "Olá "
//      antes de cada nome
//  Etapa 2 -
//      Percorra a lista modificada usando um forEach e imprima
//      todos os seus valores
fun main() {
    //Criar lista
    val nomesLista = listOf("Nome1","Nome2","Nome3")
    //Etapa 1
    val nomeComOla = nomesLista.map{"Ola $it"}
    //Etapa 2
    nomeComOla.forEach{
        println(it)
    }

    //Segunda forma:
    val nomeComOla2 = nomesLista.map{"Ola $it"}.forEach{println(it)}
    println(nomeComOla2)

}