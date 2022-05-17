package aula22.exercicio01.subclasse

import aula22.exercicio01.classeabstrata.Item

class DVD(
    private val nome: String,
    private val preco: Double,
    private val codigoBarras: String,
    private val duracao: Int
) : Item(nome, preco, codigoBarras) {
    override fun mostrarDetalhesDoItem() {
        println("DVD: $nome | Duração: $duracao | Preço: $preco")
    }
}