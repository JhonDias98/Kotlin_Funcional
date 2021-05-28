package br.com.alura.bytebank.testeFuncional

//Tanto Lambda quanto Anonima, não podem ser reutilizadas, ex: como referências
//Função anonima é usada mais para quando queremos deixar claro os parâmetros e retorno
//Função anonima é preciso usar 'return' quando não é Unit
fun main() {
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como anonima")
    }
    println(minhaFuncaoAnonima())

    //Função anonima com parametro e retorno simplificada
    val soma: (Int, Int) -> Int = fun(numero1, numero2): Int {
        println("Resultado")
        return numero1 + numero2
    }
    println(soma(20, 50))

    //Função anonima com parametro e retorno simplificada
    val somaSimplificado = fun(numero1: Int, numero2: Int): Int {
        println("Resultado")
        return numero1 + numero2
    }
    println(somaSimplificado(62, 10))


}