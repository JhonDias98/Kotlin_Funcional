package br.com.alura.bytebank.testeFuncional

fun main() {
    //Podemos fazer retornos aparti de labels, no caso 'lambda@', com isso ele vai retorna aparti da label
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if(salario > 1000.0){
            //Como lambda retorna sempre a ultima instrução, usamos 'return@lambda' para ele considerar outros retornos
            return@lambda salario + 50
        }
        salario + 100.0
    }
    println(calculaBonificacao(1000.0))
}