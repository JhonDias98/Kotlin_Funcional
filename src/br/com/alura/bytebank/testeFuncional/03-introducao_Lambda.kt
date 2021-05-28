package br.com.alura.bytebank.testeFuncional

//Tanto Lambda quanto Anonima, não podem ser reutilizadas, ex: como referências
//No retorno da função lambda o importante é que a ultima instrução deve retorna o mesmo tipo da função
fun main() {
    val minhaFuncaoLambda: () -> Unit = { //Uma forma de fazer
        println("Executa como lambda")
    }
    println(minhaFuncaoLambda())

    val multiplica =  { //Outra forma simplificada
        2 * 5
    }
    println(multiplica())

    //Lambda com parametro e retorno
    val soma: (Int, Int) -> Int = { numero1, numero2 -> //Usando argumentos
        println("Resultado da soma")
        numero1 + numero2
    }
    println(soma(9,5))

    //Lambda com parametro e retorno simplificada
    val somaSimplificada = { numero1: Int, numero2: Int ->
        println("Resultado da soma")
        numero1 + numero2
    }
    println(somaSimplificada(10,5))

    //Quando não vamor utilizar todos os parametros, colocamos um underscore '_' no lugar do nome do parametro
    val somaTresParametros = { numero1: Int, numero2: Int, _: Int ->
        println("Resultado da soma")
        numero1 + numero2
    }
    println(somaSimplificada(10,5))
}
