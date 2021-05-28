package br.com.alura.bytebank.testeFuncional

import br.com.alura.bytebank.modelo.Endereco

//Com o Apply conseguimos fazer igual ao uso do Let, porém referencia o objeto com 'this'
//Diferente do Let, o Apply retorna o objeto de contexto
fun main() {
    val endereco = Endereco()
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }.apply {
            "$logradouro, $numero"
        }.apply(::println) //Como o apply retorna o seu objeto de contexto, não será exibido a string acima


}