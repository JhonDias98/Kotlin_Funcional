package br.com.alura.bytebank.testeFuncional

import br.com.alura.bytebank.modelo.Endereco

//Also é parecido com o apply, pois retorna o objeto, e usa a referencia como 'it'
//É recomendado usar mais para 'instruções', pois sua remoção não deve afetar o código
fun main() {

    val endereco = Endereco()
        .also { println("Criando endereço") }
        .apply {
            logradouro = "Rua Magali"
        }
}