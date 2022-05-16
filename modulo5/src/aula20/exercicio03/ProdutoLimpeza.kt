package aula20.exercicio03

import java.time.LocalDate

class ProdutoLimpeza(
    private val nome: String,
    private val codigoBarras: String,
    private val dataValidade: LocalDate,
    private val areaDaCasa: String
) :
    Produto(nome, codigoBarras) {
    internal fun mostrarProduto() {
        super.printarProduto()
    }
}