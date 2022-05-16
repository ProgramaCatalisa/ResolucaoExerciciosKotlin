package aula21.exercicio01.superclasse

import aula21.exercicio01.composicao.PessoaAutora

open class Livro(internal val genero: String) {
    private val titulo: String = ""
    private val isbn: Int = 0
    private val pessoaAutora: PessoaAutora = PessoaAutora()


    internal fun registrarLivro(isbn: Int) {
        println("O livro foi registrado com o isbn $isbn")
    }

    internal fun registrarLivro(isbn: Int, titulo: String) {
        println("O livro foi registrado com o isbn $isbn e o nome $titulo")
    }

    internal fun registrarLivro(isbn: Int, titulo: String, genero: String) {
        println("O livro foi registrado com o isbn $isbn, o nome $titulo e o gênero $genero")
    }

    internal fun registrarLivro(isbn: Int, titulo: String, genero: String, pessoaAutora: PessoaAutora) {
        println("O livro foi registrado com todos os atributos")
    }
}