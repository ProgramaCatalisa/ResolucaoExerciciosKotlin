package aula13

fun main() {
    val listaNumeros = IntArray(15)
    var contador = 0

    for (numero in listaNumeros) {
        print("Digite o ${contador + 1}º número: ")
        val input = readln().toInt()
        listaNumeros[contador] = input
        contador++
    }

    val media = listaNumeros.average()
    print("A média é: $media")
}