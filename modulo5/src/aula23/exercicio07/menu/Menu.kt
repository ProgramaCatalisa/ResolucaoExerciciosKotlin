package aula23.exercicio07.menu

import aula23.exercicio03.menu.Menu
import aula23.exercicio07.formas.*
import kotlin.system.exitProcess

class Menu {
    companion object {
        internal fun menu(){
            println("\nA área de qual forma você deseja calcular?")
            println("1 - Quadrado")
            println("2 - Retângulo")
            println("3 - Triângulo")
            println("4 - Losango")
            println("5 - Círculo")
            println("6 - Sair do programa")

            val opcao = readln().toInt()

            when (opcao){
                1 -> {
                    println("Informe o tamanho do lado do quadrado: ")
                    val lado = readln().toDouble()
                    Quadrado(lado).calcularArea()
                    menu()
                }
                2 -> {
                    println("Informe o tamanho da base do retângulo: ")
                    val base = readln().toDouble()
                    println("Informe o tamanho da altura do retângulo: ")
                    val altura = readln().toDouble()
                    Retangulo(base,altura).calcularArea()
                    menu()
                }
                3 -> {
                    println("Informe o tamanho da base do tritângulo: ")
                    val base = readln().toDouble()
                    println("Informe o tamanho da altura do trtângulo: ")
                    val altura = readln().toDouble()
                    Triangulo(base,altura).calcularArea()
                    menu()
                }
                4 -> {
                    println("Informe o tamanho da primeira diagonal do losango: ")
                    val diagona1 = readln().toDouble()
                    println("Informe o tamanho da segunda diagonal do losango: ")
                    val diagonal2 = readln().toDouble()
                    Losango(diagona1,diagonal2).calcularArea()
                    menu()
                }
                5 -> {
                    println("Informe o tamanho do raio do círculo: ")
                    val raio = readln().toDouble()
                    Circulo(raio).calcularArea()
                    menu()
                }
                6 -> {
                    println("Até breve!")
                    exitProcess(0)
                }
                else -> {
                    println("Opção inválida, tente novamente")
                    Menu.menu()
                }
            }
        }
    }
}