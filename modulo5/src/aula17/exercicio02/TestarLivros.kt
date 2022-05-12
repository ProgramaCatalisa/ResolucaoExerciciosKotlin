package aula17.exercicio02

fun main() {
    testarLivro()

    val livros: ArrayList<Livro> = criarListaLivros()
    printarLivros(livros)
}

fun testarLivro() {
    val livrofavorito = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 98, paginasLidas = 0)
    livrofavorito.informacaoLivro()

    livrofavorito.paginasLidas = 20
    livrofavorito.verificarProgresso()

    livrofavorito.paginasLidas = 50
    livrofavorito.verificarProgresso()
}

fun criarListaLivros(): ArrayList<Livro> {
    val livro1 = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 10, paginasLidas = 5)
    val livro2 = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 20, paginasLidas = 15)
    val livro3 = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 30, paginasLidas = 20)
    val livro4 = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 40, paginasLidas = 25)
    val livro5 = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 50, paginasLidas = 30)
    val livro6 = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 60, paginasLidas = 35)
    val livro7 = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 70, paginasLidas = 40)
    val livro8 = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 80, paginasLidas = 45)
    val livro9 = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 90, paginasLidas = 50)
    val livro10 = Livro(titulo = "O Pequeno Príncipe", quantidadePaginas = 100, paginasLidas = 55)
    val listaLivros: ArrayList<Livro> = ArrayList()
    listaLivros.add(livro1)
    listaLivros.add(livro2)
    listaLivros.add(livro3)
    listaLivros.add(livro4)
    listaLivros.add(livro5)
    listaLivros.add(livro6)
    listaLivros.add(livro7)
    listaLivros.add(livro8)
    listaLivros.add(livro9)
    listaLivros.add(livro10)

    return listaLivros
}

fun printarLivros(livros: ArrayList<Livro>) {
    livros.forEach { livro ->
        println("Os livros criados foram: ")
        println("Título: ${livro.titulo}")
        println("Páginas lidas: ${livro.paginasLidas}")
        println("Progresso: ${livro.verificarProgresso()}")
        println("========================")
    }
}
