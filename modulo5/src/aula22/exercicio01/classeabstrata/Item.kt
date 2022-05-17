package aula22.exercicio01.classeabstrata

abstract class Item(private val nome: String, private val preco: Double, private val codigoBarras: String) {
    internal abstract fun mostrarDetalhesDoItem()

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Item -> {
                this.codigoBarras == other.codigoBarras
            }
            else -> false
        }
    }
}