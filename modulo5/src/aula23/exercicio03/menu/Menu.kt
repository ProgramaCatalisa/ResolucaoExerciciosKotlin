package aula23.exercicio03.menu

import aula23.exercicio03.classeabstrata.Peca
import aula23.exercicio03.guardavolumes.GuardaVolumes
import aula23.exercicio03.items.Acessorio
import aula23.exercicio03.items.Roupa
import kotlin.system.exitProcess

class Menu {
    companion object {
        val listaPecas: ArrayList<Peca> = ArrayList()
        val guardaVolumes = GuardaVolumes()

        internal fun inicio() {
            println("Bem vinde ao  SaveTheRoupa S.A.")
        }

        internal fun menu() {
            println("O que deseja fazer hoje?")
            println("1 - Guardar volume")
            println("2 - Retirar volume")
            println("3 - Ver itens de um volume")
            println("4 - Ver todos os itens guardados")
            println("5 - Sair do programa")

            val opcao = readln().toInt()

            when (opcao) {
                1 -> {
                    menuInsercaoPeca()
                }

                2 -> {
                    println("Informe o código do volume que deseja retirar: ")
                    val codigoVolumeRetirar = readln().toInt()

                    guardaVolumes.devolverPecas(codigoVolumeRetirar)
                    menu()
                }

                3 -> {
                    println("Informe o código do volume que deseja pesquisar: ")
                    val codigoVolumePesquisar = readln().toInt()
                    guardaVolumes.mostrarPeca(codigoVolumePesquisar)
                    menu()
                }

                4 -> {
                    guardaVolumes.mostrarPeca()
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

        private fun menuInsercaoPeca() {
            println("Adicione algo ao volume para guardá-lo")
            println("1 - Adicionar roupas")
            println("2 - Adicionar acessórios")
            println("3 - Guardar volume")
            println("4 - Cancelar")
            println("5 - Sair do sistema")

            val opcao = readln().toInt()

            when (opcao) {
                1 -> {
                    println("Informe o nome da marca da roupa: ")
                    val marca = readln()

                    println("Informe o modelo da roupa: ")
                    val modelo = readln()

                    val roupa = Roupa(marca, modelo)
                    listaPecas.add(roupa)

                    menuInsercaoPeca()
                }
                2 -> {
                    println("Informe o nome da marca do acessório: ")
                    val marca = readln()

                    println("Informe o modelo do acessório: ")
                    val modelo = readln()

                    println("Informe o tipo do acessório: ")
                    val tipo = readln()

                    val acessorio = Acessorio(marca, modelo, tipo)
                    listaPecas.add(acessorio)

                    menuInsercaoPeca()
                }
                3 -> {
                    if (listaPecas.isEmpty()){
                        println("O volume está vazio, adicione uma roupa ou um acessório antes de guardá-lo \n")
                        menuInsercaoPeca()
                    } else {
                        val codigoVolumeGuardado = guardaVolumes.guardarPecas(listaPecas)
                        println("Seu volume foi guardado sob o código: $codigoVolumeGuardado")
                        listaPecas.clear()
                        menu()
                    }
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