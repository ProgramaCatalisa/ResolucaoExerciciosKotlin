package aula23.exercicio04

abstract class Quadrilateros(
    private val lado1: Double,
    private val lado2: Double,
    private val lado3: Double,
    private val lado4: Double
) {
    protected fun calcularPerimetro() {
        val perimetro = lado1 + lado2 + lado3 + lado4
        println("O perímetro do quadrilátero é: $perimetro")
    }
}