package aula17.exercicio03

import aula17.exercicio03.Filme.Companion.listaFilmesEmCartaz

fun main() {
    testarFilme()
    val listaFilmes = criarListaFilme()
    testarListaFilmes(listaFilmes)
    listaFilmesEmCartaz(listaFilmes)
}

fun testarFilme() {
    val filme1 = Filme(titulo = "Os Vingadores", duracaoEmMinutos = 142)
    filme1.exibirDuracaoHorasMinutos()
    filme1.exibirDuracaoEmHoras()

    val filme2 = Filme(titulo = "Hotel Transilvânia", duracaoEmMinutos = 93)
    filme2.exibirDuracaoHorasMinutos()
    filme2.exibirDuracaoEmHoras()

    listaFilmesEmCartaz(filme1, filme2)
}

fun criarListaFilme(): ArrayList<Filme> {
    val filme1 = Filme(titulo = "Titanic", duracaoEmMinutos = 300)
    val filme2 = Filme(titulo = "Space Jam", duracaoEmMinutos = 200)
    val filme3 = Filme(titulo = "Toy Story", duracaoEmMinutos = 400)
    val filme4 = Filme(titulo = "Os Groods", duracaoEmMinutos = 500)
    val filme5 = Filme(titulo = "Vovozona", duracaoEmMinutos = 60)

    val filmes: ArrayList<Filme> = ArrayList()
    filmes.add(filme1)
    filmes.add(filme2)
    filmes.add(filme3)
    filmes.add(filme4)
    filmes.add(filme5)

    return filmes
}

fun testarListaFilmes(listaFilmes: ArrayList<Filme>) {
    listaFilmes.forEach { filme ->
        filme.exibirDuracaoEmHoras()
        filme.exibirDuracaoHorasMinutos()
    }
}

