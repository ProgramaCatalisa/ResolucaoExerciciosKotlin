package aula23.exercicio04.formas

import aula23.exercicio04.interfaces.FormaGeometrica
import kotlin.math.PI
import kotlin.math.pow

class Circulo (val raio: Double) : FormaGeometrica {
    override fun calcularPerimetro() {
        val perimetro = 2 * PI * raio
        println("O perímetro do círculo é: $perimetro")
    }

    override fun calcularArea() {
        val area = PI * raio.pow(2)
        println("A área do círculo é: $area")
    }
}