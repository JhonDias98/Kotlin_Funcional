package br.com.alura.bytebank.testeFuncional

fun main() {
    //Formas de fazer informando o tipo dos parametro e o tipo do retorno
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())

    val minhaFuncaoClasseSoma: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasseSoma(5, 7))

    //Forma simples sem precisar passar o tipo dos parâmetros e o tipo do retorno
    val minhaFuncaoClasseSimples = Teste()
    println(minhaFuncaoClasseSimples())

    val minhaFuncaoClasseSomaSimples = Soma()
    println(minhaFuncaoClasseSomaSimples(5, 7))
}

class Teste : () -> Unit { //Classe como função
    override fun invoke() { //Quando a classe é do tipo função, é obrigado a sobrescrever o método invoke
        println("executa invoke do Teste")
    }
}

class Soma : (Int, Int) -> Int { //Classe como função com parametros
    override fun invoke(n1: Int, n2: Int): Int {
        return n1 + n2
    }
}

class SomaSimplificado : (Int, Int) -> Int { //Classe como função com parametros
    override fun invoke(n1: Int, n2: Int): Int = n1 + n2 //Simplificando o retorno
}