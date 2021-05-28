package br.com.alura.bytebank.testeFuncional

fun main() {
    //Os retornos aqui funcionada da forma formar
    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if(salario > 1000.0){
            return salario + 50
        }
        return salario + 100.0
    }
    println(calculaBonificacaoAnonima(1100.0))
}