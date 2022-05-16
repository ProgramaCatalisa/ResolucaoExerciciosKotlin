package aula21.exercicio01

import aula21.exercicio01.composicao.PessoaAutora
import aula21.exercicio01.subclasse.Romance
import aula21.exercicio01.subclasse.Suspense
import aula21.exercicio01.subclasse.Terror

fun main() {
    val pessoaAutora01 = PessoaAutora()
    pessoaAutora01.nome = "Machado de Assis"
    pessoaAutora01.email = "email@email.com"

    val livroRomance = Romance()
    livroRomance.registrarLivro(isbn = 1234)
    livroRomance.registrarLivro(isbn = 1234, titulo = "Dom Casmurro")
    livroRomance.registrarLivro(isbn = 1234, titulo = "Dom Casmurro", livroRomance.genero)
    livroRomance.registrarLivro(isbn = 1234, titulo = "Dom Casmurro", livroRomance.genero, pessoaAutora01)

    val pessoaAutora02 = PessoaAutora()
    pessoaAutora02.nome = "Harlan Coben"
    pessoaAutora02.email = "hc@email.com"

    val livroSuspense = Suspense()
    livroSuspense.registrarLivro(isbn = 5678)
    livroSuspense.registrarLivro(isbn = 5678, titulo = "O Estranho")
    livroSuspense.registrarLivro(isbn = 5678, titulo = "O Estranho", livroSuspense.genero)
    livroSuspense.registrarLivro(isbn = 5678, titulo = "O Estranho", livroSuspense.genero, pessoaAutora02)

    val pessoaAutora03 = PessoaAutora()
    pessoaAutora03.nome = "Stephen King"
    pessoaAutora03.email = "ksk@email.com"

    val livroTerror = Terror()
    livroTerror.registrarLivro(isbn = 9012)
    livroTerror.registrarLivro(isbn = 9012, titulo = "It: a coisa")
    livroTerror.registrarLivro(isbn = 9012, titulo = "It: a coisa", livroTerror.genero)
    livroTerror.registrarLivro(isbn = 9012, titulo = "It: a coisa", livroTerror.genero, pessoaAutora03)

}