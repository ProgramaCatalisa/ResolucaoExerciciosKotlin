package aula23.exercicio04.formas

import aula23.exercicio04.interfaces.FormaGeometrica

abstract class Quadrilateros : FormaGeometrica {

    abstract val lado1: Double
    abstract val lado2: Double
    abstract val lado3: Double
    abstract val lado4: Double
    override fun calcularPerimetro() {
        val perimetro = lado1 + lado2 + lado3 + lado4
        println("O perímetro do quadrilátero é: $perimetro")
    }
}