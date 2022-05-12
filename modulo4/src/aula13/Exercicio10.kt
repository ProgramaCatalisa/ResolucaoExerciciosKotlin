package aula13

fun main() {
    var contador = 0
    var soma = 0

    do {
        soma += contador
        contador++
        println(contador)
    } while (contador < 15)

    print("Soma total: $soma")
}