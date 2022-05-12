package aula14

fun main() {
    print("Digite um número para fazeros a soma de 1 até esse número: ")
    val numeroInput = readln().toInt()

    somar(numeroInput)
}

fun somar(input: Int) {
    var soma = 0
    for (numero: Int in 1..input) {
        soma += numero
    }
    print("A soma de 1 até $input é: $soma")
}