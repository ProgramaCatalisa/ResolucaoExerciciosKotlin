package aula12

fun main() {
    print("Digite a sua idade: ")
    val idade = readln().toInt()
    val diasEmUmAno = 365

    if (idade < 0) {
        print("Aceitamos apenas idade maior ou igual a 0 (zero), tente novamente")
    } else {
        val diasVividos = diasEmUmAno * idade
        print("Você viveu $diasVividos dias")
    }
}