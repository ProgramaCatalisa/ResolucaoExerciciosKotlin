package aula23.exercicio04

class Retangulos(override val lado1: Double, override val lado2: Double) : Quadrilateros() {

    override val lado3: Double
        get() = lado1
    override val lado4: Double
        get() = lado2

    override fun calcularArea() {
        val area = lado1 * lado2
        println("A área do quadrado é: $area")
    }
}