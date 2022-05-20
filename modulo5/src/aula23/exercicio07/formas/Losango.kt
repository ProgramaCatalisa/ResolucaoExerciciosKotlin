package aula23.exercicio07.formas

import aula23.exercicio07.interfaces.FormaGeometrica

class Losango (val diagonal1:Double, val diagonal2:Double) : FormaGeometrica {
    override fun calcularArea() {
        println("A área do losango é: ${(diagonal1 * diagonal2)/2}")
    }
}