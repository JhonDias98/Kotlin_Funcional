package br.com.alura.bytebank.testeFuncional

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca

//Run retorna o resultado das instruções, fazendo referencia como this
fun main() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234), 1000)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("rendimento mensal $rendimentoMensal")
    }

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) { //Repeat: quantidade de vezes que será repetipo o bloco de código
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("simulação rendimento anual $rendimentoAnual")
}