package br.com.alura.bytebank.testeFuncional

import br.com.alura.bytebank.modelo.Autenticavel

fun main() {
    //02 - Instancia um usuário autenticado
    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    //03 - chama o método da classe passando os parametros junto da função
    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("realizar pagamento") //Vai ser executado caso entrar no if do método da classe
    })
}

class SistemaInterno {
    //01 - Recebe o usuário atenticado, a senha e uma função
    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}){
        if(admin.autentica(senha)){
            println("Bem vindo ao Bytebank")
            autenticado() //executa a função do parametro
        } else {
            println("Falha na autenticação")
        }
    }
}