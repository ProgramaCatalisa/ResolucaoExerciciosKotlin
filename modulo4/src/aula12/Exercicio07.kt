package aula12

fun main() {
    print("Informe a base do retângulo em metros(m): ")
    val base = readln().toDouble()

    print("Informe a altura do retângulo em metros(m): ")
    val altura = readln().toDouble()

    val area = base * altura

    print("A área do retângulo informado é: $area")
}