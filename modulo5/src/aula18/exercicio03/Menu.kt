package aula18.exercicio03

import kotlin.system.exitProcess

class Menu {
    companion object {
        val alune: Alune = Alune()

        fun inicio() {
            println(
                "Bem vinde ao sistema Catalisa de cálculo de médias escolares!"
            )
        }

        fun menu() {
            println("Digite a opção que da ação que deseja realizar")
            println("1 - Informar pessoa")
            println("2 - Calcular média")
            println("3 - Sair do programa")

            val opcao = readln().toInt()

            when (opcao) {
                1 -> {
                    alune.capturarNome()
                    alune.capturarNotas()
                    menu()
                }
                2 -> {
                    alune.calcularMedia()
                    continuar()
                }
                3 -> {
                    println("Até breve!")
                    exitProcess(0)
                }
                else -> {
                    println("Opção inválida, tente novamente")
                    menu()
                }
            }

        }

        /*Seu programa deve imprimir a mensagem “novo cálculo (1-sim 2-nao)”,
        solicitando aos professores que informem um código (1 ou 2) indicando se
        deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2).
        Se for informado o código 1 deve ser repetida a execução de
        do programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.*/
        private fun continuar() {
            println("Novo cálculo: 1-sim 2-não: ")
            val opcao = readln().toInt()

            when (opcao) {
                1 -> {
                    menu()
                }
                2 -> {
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