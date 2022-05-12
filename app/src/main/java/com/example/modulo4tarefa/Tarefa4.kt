package com.example.modulo4tarefa

class Tarefa4 {
}
//• Crie uma lista com os números inteiro de 1 a 99
//  Etapa 1 -
//      • Utilizando esta lista crie um filtro que retorna uma lista
//      com os números pares contidos na lista original
fun main() {
    //Criar lista
    var lista:MutableList<Int> = mutableListOf()
    var n = 1
    do{
        lista.add(n)
        n += 1
    }while(n!=100)

    //Etapa 1
    val numerosListaMap = lista.filter{it%2==0}.forEach{println("Os numeros pares da lista sao: $it")}

}