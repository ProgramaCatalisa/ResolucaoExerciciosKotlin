package aula22.exercicio01.subclasse

import aula22.exercicio01.classeabstrata.Item

class Livro(private val nome: String, private val preco: Double, codigoBarras: String, private val autor: String) :
    Item(nome, preco, codigoBarras) {

    override fun mostrarDetalhesDoItem() {
        println("Livro: $nome | Autor: $autor | Preço: $preco")
    }
}