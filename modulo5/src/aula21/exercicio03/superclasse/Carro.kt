package aula21.exercicio03.superclasse

import aula21.exercicio03.enum.Portas

open class Carro(
    private val marca: String,
    private val ano: Int,
    private val valor: Double,
    private val cor: String,
    private val portas: Portas,
    private val velocidade: Double = 0.0
) {

    protected open fun iniciarMotor() {
        println("Iniciando motor")

    }

    protected open fun frear() {
        println("Freando carro")
    }

    protected open fun acelerar() {
        println("Acelerando")
    }

}