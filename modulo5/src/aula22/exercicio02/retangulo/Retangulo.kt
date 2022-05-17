package aula22.exercicio02.retangulo

import aula22.exercicio02.classeabstrata.Forma

open class Retangulo(private val lado: Float, private val altura: Float) : Forma() {
    override fun calcularArea(): Float {
        return lado * altura
    }

    override fun calcularPerimetro(): Float {
        return 2 * (lado + altura)
    }
}