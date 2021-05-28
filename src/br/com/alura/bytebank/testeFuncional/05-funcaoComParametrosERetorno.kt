package br.com.alura.bytebank.testeFuncional

fun main() {
    val testa: (Int, Int) -> Int = ::soma
    println(testa(10,65))
}

//funcao(parametro: tipoDoParametro): tipoDoRetorno
fun soma(a: Int, b: Int): Int {
    return a + b
}