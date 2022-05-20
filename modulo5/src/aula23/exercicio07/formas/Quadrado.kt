package aula23.exercicio07.formas

import aula23.exercicio07.interfaces.FormaGeometrica
import kotlin.math.pow

class Quadrado(val lado:Double) : FormaGeometrica {
    override fun calcularArea() {
        println("A área do quadrado é: ${lado.pow(2)}") 
    }
}