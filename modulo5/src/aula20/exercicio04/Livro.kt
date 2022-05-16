package aula20.exercicio04

open class Livro() {
    var titulo: String = ""
    val pessoaAutora: PessoaAutora = PessoaAutora()

    protected fun printarLivro() {
        println("Livro: $titulo")
        println("Nome autora: ${pessoaAutora.nome} | E-mail: ${pessoaAutora.email}")
    }
}