package br.com.alura.bytebank.testeFuncional

import br.com.alura.bytebank.modelo.ContaPoupanca

fun main() {
    somaReceiver(9, 5, resultado = {
        println(this.plus(6)) //02 - Podemos acessar os métodos do Int
    })
}

// 01 - Receiver faz que com a função fosse membro de um objeto, por exemplo do Int
fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit){
    println("antes da soma")
    val total = a + b
    total.resultado() //podemos retornar assim
    //resultado(a + b) //ou assim
    println("depois da soma")
}