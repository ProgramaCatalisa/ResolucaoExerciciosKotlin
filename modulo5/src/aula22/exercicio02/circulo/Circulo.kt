package aula22.exercicio02.circulo

import aula22.exercicio02.classeabstrata.Forma
import kotlin.math.pow

class Circulo(private val raio: Float) : Forma() {
    override fun calcularArea(): Float {
        return Math.PI.toFloat() * raio.pow(2f)
    }

    override fun calcularPerimetro(): Float {
        return 2 * Math.PI.toFloat() * raio
    }
}