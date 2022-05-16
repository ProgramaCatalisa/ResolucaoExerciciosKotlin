package aula20.exercicio03

class UtensilioDomestico(
    private val nome: String,
    private val codigoBarras: String,
    private val conjunto: Boolean
) : Produto(nome, codigoBarras) {

    internal fun mostrarProduto() {
        super.printarProduto()
    }
}