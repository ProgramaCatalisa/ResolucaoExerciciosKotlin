package aula17.exercicio02

class Livro(val titulo: String, val quantidadePaginas: Int, var paginasLidas: Int) {

    fun verificarProgresso() {
        val porcentagem = (paginasLidas.toDouble()/quantidadePaginas)*100
        println("Você já leu $porcentagem por cento do livro")
    }

    fun informacaoLivro() {
        println("O livro $titulo possui $quantidadePaginas páginas")
    }
}