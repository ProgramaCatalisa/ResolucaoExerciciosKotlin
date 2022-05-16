package aula21.exercicio02.menu

import aula21.exercicio02.composicao.Responsavel
import aula21.exercicio02.subclasse.Cachorro
import aula21.exercicio02.subclasse.Gato
import aula21.exercicio02.superclasse.Animal
import kotlin.system.exitProcess

class Menu {
    init {
        println(
            "Bem vinde ao sistema Catalisa de Petshop!"
        )
    }

    companion object {
        private val animal = Animal()

        fun menu() {
            println("Digite a opção que da ação que deseja realizar")
            println("1 - Cadastrar novo animal")
            println("2 - Ver animais cadastrados")
            println("3 - Movimentar animais")
            println("4 - Alimentar animais")
            println("5 - Colocar animais para dormir")
            println("6 - Sair do programa")

            val opcao = readln().toInt()

            when (opcao) {
                1 -> {
                    menuCadastro()
                    menu()
                }
                2 -> {
                    animal.exibirAnimais()
                    menu()
                }
                3 -> {
                    animal.movimentarAnimais()
                    menu()
                }
                4 -> {
                    animal.alimentarAnimais()
                    menu()
                }
                5 -> {
                    animal.ninarAnimais()
                    menu()
                }
                6 -> {
                    println("Até breve!")
                    exitProcess(0)
                }
                else -> {
                    println("Opção inválida, tente novamente")
                    menu()
                }
            }

        }

        private fun menuCadastro() {
            println("Digite a opção do tipo de animal que deseja cadastrar")
            println("1 - Cachorro")
            println("2 - Gato")
            println("3 - Peixe")
            println("4 - Voltar para o menu inicial")
            println("5 - Sair do programa")

            val opcao = readln().toInt()

            when (opcao) {
                1 -> {
                    println("Digite o nome do dog: ")
                    val nome = readln()

                    println("Digite a raça do dog: ")
                    val raca = readln()

                    println("Digite o nome do responsável pelo dog: ")
                    val nomeResponsavel = readln()

                    println("Digite o e-mail do responsável pelo dog: ")
                    val emailResponsavel = readln()

                    val responsavel = Responsavel(nomeResponsavel, emailResponsavel)

                    val cachorro = Cachorro(nome, raca, responsavel)

                    animal.cadastrarAnimal(cachorro)
                }
                2 -> {
                    println("Digite o nome do gatíneo: ")
                    val nome = readln()

                    println("Digite a raça do gatíneo: ")
                    val raca = readln()

                    println("Digite o nome do responsável pelo gatíneo: ")
                    val nomeResponsavel = readln()

                    println("Digite o e-mail do responsável pelo gatíneo: ")
                    val emailResponsavel = readln()

                    val responsavel = Responsavel(nomeResponsavel, emailResponsavel)

                    val gato = Gato(nome, raca, responsavel)

                    animal.cadastrarAnimal(gato)
                }
                3 -> {
                    println("Digite o nome do peixinho: ")
                    val nome = readln()

                    println("Digite a raça do peixinho: ")
                    val raca = readln()

                    println("Digite o nome do responsável pelo peixinho: ")
                    val nomeResponsavel = readln()

                    println("Digite o e-mail do responsável pelo peixinho: ")
                    val emailResponsavel = readln()

                    val responsavel = Responsavel(nomeResponsavel, emailResponsavel)

                    val peixe = Gato(nome, raca, responsavel)

                    animal.cadastrarAnimal(peixe)
                }
                4 -> {
                    menu()
                }
                5 -> {
                    println("Até breve!")
                    exitProcess(0)
                }
                else -> {
                    println("Opção inválida, tente novamente")
                    menu()
                }
            }
        }
    }
}