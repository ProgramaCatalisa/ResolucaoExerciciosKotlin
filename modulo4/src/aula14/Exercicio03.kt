package aula14

import kotlin.math.pow

fun main() {
    print("Digite seu peso em kg. Exemplo 57: ")
    val peso = readln().toDouble()

    print("Digite sua altura em metros. Exemplo 1.64: ")
    val altura = readln().toDouble()

    calcularImc(peso, altura)
}

fun calcularImc(peso: Double, altura: Double) {
    val imc = peso / altura.pow(2)

    if (imc < 18.5) {
        print("Sua classificação é MAGREZA")
    } else if (imc >= 18.5 && imc < 24.9) {
        print("Sua classificação é NORMAL")
    } else if (imc >= 25.0 && imc < 29.9) {
        print("Sua classificação é SOBREPESO")
    } else if (imc >= 30.0 && imc < 39.9) {
        print("Sua classificação é OBESIDADE")
    } else {
        print("Sua classificação é OBESIDADE GRAVE")
    }
}
