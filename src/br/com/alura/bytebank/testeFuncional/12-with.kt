package br.com.alura.bytebank.testeFuncional

import br.com.alura.bytebank.modelo.Endereco

//With modifica o objeto e retorna ele modificado, faz a referencia como 'this'
fun main() {
    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)

    //Diferente do Let, Apply, Run e Also, o With não da para usar como extensão de função
    with(endereco) {
        logradouro = "Rua da Aparecisa"
        numero = 154
        bairro = "Jardim Silvina"
    }
    println(endereco)

    //Criando o objeto do zero
    with(Endereco()) {
        logradouro = "rua vergueiro"
        numero = 3185
        bairro = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "02310-063"
        complemento = "Apartamento"
        completo() //Método da classe Endereço
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
