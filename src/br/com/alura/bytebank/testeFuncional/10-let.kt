package br.com.alura.bytebank.testeFuncional

import br.com.alura.bytebank.modelo.Endereco
import java.time.LocalDate

//Let é usado para fazer referencia do seu valor sem precisar alterar o próprio
//Também varifica se o valor é nulo 'valor?.let{}'
fun main() {
    //Usando a classe Endereço para fazer Scope Functions
    Endereco(logradouro = "rua vergueiro", numero = 3185)
        .let { endereco -> //Aqui criou uma referencia de endereço
            "${endereco.logradouro}, ${endereco.numero}".toUpperCase() //Criou uma String
        }.let { enderecoString -> //pegou a referencia da String
            "$enderecoString, data: ${LocalDate.now().toString()}" //Acrescentou a data
        }.let(::println) //Pegou a referencia da String para exibir

    //Criando um lista de endereços para exibir
    listOf(Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento"))
        .filter (predicate = { endereco -> endereco.complemento.isNotEmpty() }) //Filtra os que não são nulos
        .let(block = (::println))

}

fun checkNull() {
    var nome: String? = "Jonathan"
    nome?.let(::println)
}


