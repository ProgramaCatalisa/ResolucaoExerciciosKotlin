package aula23.exercicio07.formas

import aula23.exercicio07.interfaces.FormaGeometrica
import kotlin.math.PI
import kotlin.math.pow

class Circulo (val raio: Double) : FormaGeometrica {

    override fun calcularArea() {
        val area = PI * raio.pow(2)
        println("A área do círculo é: $area")
    }
}