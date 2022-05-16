package aula21.exercicio02.subclasse

import aula21.exercicio02.composicao.Responsavel
import aula21.exercicio02.superclasse.Animal

class Gato(nome: String, raca: String, responsavel: Responsavel) : Animal(nome, raca, responsavel) {
    override fun movimentar() {
        println("Andando e saltando em 4 patas")
    }

    override fun comer() {
        println("Comendo whiskas sachê")
    }

    override fun dormir() {
        println("Dormindo na caixa")
    }
}