package aula12

fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()

    val antecessor = numero - 1

    print("O antecessor do número digitado é: $antecessor")
}