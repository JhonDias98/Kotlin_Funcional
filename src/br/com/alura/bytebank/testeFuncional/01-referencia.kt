package br.com.alura.bytebank.testeFuncional

fun main() {
    //Usar '::' para fazer referencia de uma função
    // val minhaFuncao: () -> Unit = ::teste
    val minhaFuncao = ::teste
    println(minhaFuncao()) //Usar '()' para que a função seja executada
}


fun teste() {
    println("executa teste")
}
