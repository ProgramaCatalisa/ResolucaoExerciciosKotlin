package aula21.exercicio03

import aula21.exercicio03.enum.Portas
import aula21.exercicio03.subclasse.Fiat
import aula21.exercicio03.subclasse.Hyundai
import aula21.exercicio03.subclasse.Renault

fun main() {
    val carro01 = Fiat(ano = 2022, valor = 50000.00, portas = Portas.DUAS_PORTAS, cor = "vermelho")
    val carro02 = Renault(ano = 1999, valor = 4000.00, portas = Portas.QUATRO_PORTAS, cor = "preto")
    val carro03 = Hyundai(ano = 2005, valor = 35000.00, portas = Portas.QUATRO_PORTAS, cor = "azul")

    carro01.iniciarMotor()
    carro01.acelerar()
    carro01.frear()

    carro02.iniciarMotor()
    carro02.acelerar()
    carro02.frear()

    carro03.iniciarMotor()
    carro03.acelerar()
    carro03.frear()
}