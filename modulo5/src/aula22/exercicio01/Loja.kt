package aula22.exercicio01

import aula22.exercicio01.classeabstrata.Item
import aula22.exercicio01.subclasse.CD
import aula22.exercicio01.subclasse.DVD
import aula22.exercicio01.subclasse.Livro

fun main() {
    var listaItens: ArrayList<Item> = ArrayList()

    val cd01 = CD("Try this", 10.0, "90237489y2", 10)
    listaItens.add(cd01)

    val dvd01 = DVD("Titanic", 5.0, "iuwegr78", 120)
    listaItens.add(dvd01)

    val livro01 = Livro("Porque eu almocei meu pai", 7.50, "098765434567", "Roy Lewis")
    listaItens.add(livro01)

    val cd02 = CD("Missundertood", 15.0, "09876tfvbnjki", 12)
    listaItens.add(cd02)

    val dvd02 = DVD("Monstros S/A", 12.0, "ytfvbnju8", 90)
    listaItens.add(dvd02)

    val livro02 = Livro("O povo brasileiro", 20.0, "098765434567", "Darci Ribeiro")
    listaItens.add(livro02)

    listaItens.forEach { item ->
        item.mostrarDetalhesDoItem()
    }

    buscarItem(cd01, listaItens)
    buscarItem(livro02, listaItens)
    println(livro02.equals(livro01))
}

fun buscarItem(item: Item, listaItens: ArrayList<Item>) {
    if (listaItens.contains(item)) {
        val index = listaItens.indexOf(item)
        println("A posição do item na lista é: $index")
    } else {
        println("Produto não encontrado")
    }
}
