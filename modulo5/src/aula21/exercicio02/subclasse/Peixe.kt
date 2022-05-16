package aula21.exercicio02.subclasse

import aula21.exercicio02.composicao.Responsavel
import aula21.exercicio02.superclasse.Animal

class Peixe(nome: String, raca: String, responsavel: Responsavel) : Animal(nome, raca, responsavel) {

    override fun movimentar() {
        println("Nadando")
    }

    override fun comer() {
        println("Comendo ração molhada")
    }

    override fun dormir() {
        println("Dormindo de olho aberto")
    }
}