package aula12

fun main() {
    print("Digite o número que deseja verificar: ")
    val numero = readln().toDouble()

    if (numero < 0) {
        print("O número é negativo")
    } else {
        print("O número é positivo")
    }
}