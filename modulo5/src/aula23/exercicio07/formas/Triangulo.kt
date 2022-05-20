package aula23.exercicio07.formas

import aula23.exercicio07.interfaces.FormaGeometrica

class Triangulo(val base:Double, val altura:Double) : FormaGeometrica {
    override fun calcularArea() {
        println("A área do triângulo é: ${(base * altura)/2}")
    }
}