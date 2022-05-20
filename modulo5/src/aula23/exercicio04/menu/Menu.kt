package aula23.exercicio04.menu

import aula23.exercicio04.formas.Circulo
import aula23.exercicio04.formas.Quadrado
import aula23.exercicio04.formas.Retangulos
import aula23.exercicio04.interfaces.FormaGeometrica
import java.util.*

class Menu {
    companion object {

        internal fun menu() {
            println("Quantas formas você deseja criar?")

            val quantasFormas = readln().toInt()
            val vectorDeFormas =  Vector<FormaGeometrica>()


            for (forma in 0 until quantasFormas) {

                println("A forma ${forma + 1} deve ser de que tipo?")
                println("1 - Quadrado")
                println("2 - Retângulo")
                println("3 - círculo")

                val tipoForma = readln().toInt()

                when (tipoForma) {
                    1 -> {
                        println("Informe o lado do quadrado a ser criado:")
                        val lado = readln().toDouble()
                        val quadrado = Quadrado(lado)
                        vectorDeFormas.addElement(quadrado)
                    }
                    2 -> {
                        println("Informe a base do retângulo a ser criado:")
                        val base = readln().toDouble()

                        println("Informe a altura do retângulo a ser criado:")
                        val altura = readln().toDouble()

                        val retangulo = Retangulos(base, altura)
                        vectorDeFormas.addElement(retangulo)
                    }
                    3 -> {
                        println("Informe o raio d círculo a ser criado:")
                        val raio = readln().toDouble()
                        val circulo = Circulo(raio)
                        vectorDeFormas.addElement(circulo)
                    }
                }
            }
            for(forma in vectorDeFormas)
            {
                println(forma.calcularArea())
                println(forma.calcularPerimetro())
            }
        }
    }
}