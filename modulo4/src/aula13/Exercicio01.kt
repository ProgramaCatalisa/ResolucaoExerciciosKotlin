package aula13

fun main() {
    val vetor = IntArray(5)
    var posicao = 0
    while (posicao < 5) {
        print("Digite o número da posição $posicao: ")
        val numero = readln().toInt()

        vetor[posicao] = numero
        posicao++
    }

    val soma = vetor.sum()

    print("A soma de todos os elementos do vetor é: $soma")

}