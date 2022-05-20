package aula23.exercicio07.formas

import aula23.exercicio07.interfaces.FormaGeometrica

class Retangulo(val base:Double, val altura:Double) : FormaGeometrica {
    override fun calcularArea() {
        println("A área do retângulo é: ${base * altura}")
    }

}