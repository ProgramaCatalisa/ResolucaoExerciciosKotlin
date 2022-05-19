package aula23.exercicio04

import kotlin.math.pow

class Quadrado (override val lado1: Double): Quadrilateros() {

    override val lado2: Double
        get() = lado1
    override val lado3: Double
        get() = lado1
    override val lado4: Double
        get() = lado1

    override fun calcularArea() {
        val area = lado1.pow(2)
        println("A área do quadrado é: $area")
    }
}