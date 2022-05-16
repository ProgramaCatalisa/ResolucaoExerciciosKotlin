package aula21.exercicio02.subclasse

import aula21.exercicio02.composicao.Responsavel
import aula21.exercicio02.superclasse.Animal

class Cachorro(nome: String, raca: String, responsavel: Responsavel) : Animal(nome, raca, responsavel) {
    override fun movimentar() {
        println("Andando em 4 patas")
    }

    override fun comer() {
        println("Comendo bife")
    }

    override fun dormir() {
        println("Dormindo na cama da Jéssica")
    }
}