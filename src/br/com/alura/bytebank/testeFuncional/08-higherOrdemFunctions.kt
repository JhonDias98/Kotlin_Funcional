package br.com.alura.bytebank.testeFuncional

//Higher Ordem Functions = funções de alta ordem
//São funções de que pode receber ou retornar outra função
fun main() {

    soma(1, 5, resultado = (::println)) //Recebe os 2 números, e com a função exibe o resultado

    soma(6,9, resultado = {
        println(it + 20) //Com o 'it' pegamos o resultado
    })

    //Atribuindo o retorno da função em uma variável
    val resultadoSoma = somaComRetorno(6,9, resultado = {
        it + 50
    })
    println(resultadoSoma)

}

//Função recebe 2 Int e uma função como argumento, onde a função será o retorno
fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("antes da soma")
    resultado(a + b) //A função do argumento recebe a soma dos 2 Int
    println("depois da soma")
}

//Função igual a de cima, porém com retorno
fun somaComRetorno(a: Int, b: Int, resultado: (Int) -> Int): Int {
    return resultado(a + b)
}