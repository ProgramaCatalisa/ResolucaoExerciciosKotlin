package aula18.exercicio02

import kotlin.system.exitProcess

class Menu {
    companion object {
        val pessoa: Pessoa = Pessoa()

        fun inicio() {
            println(
                "Bem vinde ao sistema Catalisa de cálculo de idades!"
            )
        }

        fun menu() {
            println("Digite a opção que da ação que deseja realizar")
            println("1 - Informar pessoa")
            println("2 - Calcular idade")
            println("3 - Sair do programa")

            val opcao = readln().toInt()

            when (opcao) {
                1 -> {
                    pessoa.preencherDados()
                    menu()
                }
                2 -> {
                    pessoa.calcularIdade()
                    pessoa.informarIdade()
                    menu()
                }
                3 -> {
                    println("Até breve!")
                    exitProcess(0)
                }
                else -> {
                    println("Opção inválida, tente novamtente")
                    menu()
                }
            }

        }
    }
}
