package aula21.exercicio02.superclasse

import aula21.exercicio02.composicao.Responsavel

open class Animal(
    private val nome: String = "",
    private val raca: String = "", private val responsavel: Responsavel = Responsavel()
) {


    val listaAnimais: ArrayList<Animal> = ArrayList()

    protected open fun movimentar() {
        println("Movimentando")
    }

    protected open fun comer() {
        println("Comendo")
    }

    protected open fun dormir() {
        println("Dormindo")
    }

    /*Aqui recuperamos os estudos de arraylist que vimos no módulo 04 e fizemos em alguns exercícios da aula 18*/
    fun cadastrarAnimal(animal: Animal) {
        listaAnimais.add(animal)
    }

    fun exibirAnimais() {
        listaAnimais.forEach { animal ->
            println("Animal: ${animal.nome} | Responsável: ${animal.responsavel.nome} | Raça: ${animal.raca}")
        }
    }

    fun movimentarAnimais() {
        listaAnimais.forEach { animal ->
            animal.movimentar()
        }
    }

    fun alimentarAnimais() {
        listaAnimais.forEach { animal ->
            animal.comer()
        }
    }

    fun ninarAnimais() {
        listaAnimais.forEach { animal ->
            animal.dormir()
        }
    }

}