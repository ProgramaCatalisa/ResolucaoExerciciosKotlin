package aula22.exercicio01.subclasse

import aula22.exercicio01.classeabstrata.Item

class CD(
    private val nome: String,
    private val preco: Double,
    private val codigoBarras: String,
    private val numeroFaixas: Int
) : Item(nome, preco, codigoBarras) {
    override fun mostrarDetalhesDoItem() {
        println("CD: $nome | Número de faixas: $numeroFaixas | Preço: $preco")
    }
}