package aula18.exercicio01

import kotlin.system.exitProcess

class Menu {
    companion object {
        val caixa: Caixa = Caixa()

        fun inicio() {
            println(
                "Bem vinde ao sistema Catalisa de mercado!"
            )
        }

        fun menu() {
            println("Digite a opção que da ação que deseja realizar")
            println("1 - Cadastrar produto")
            println("2 - Exibir produtos cadastrados")
            println("3 - Valor total da lista de produtos")
            println("4 - Sair do programa")

            val opcao = readln().toInt()

            when (opcao) {
                1 -> {
                    caixa.cadastrarProdutos()
                    menu()
                }
                2 -> {
                    caixa.exibirListaDeProdutos()
                    menu()
                }
                3 -> {
                    caixa.calcularValorCompra()
                    menu()
                }
                4 -> {
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