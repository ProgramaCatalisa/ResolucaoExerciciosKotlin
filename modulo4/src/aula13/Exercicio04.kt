package aula13

fun main() {
    val vetorInput = IntArray(10)
    val vetorPar = ArrayList<Int>()
    var posicao = 0

    while (posicao < 10) {
        print("Digite o número da posição $posicao: ")
        val numero = readln().toInt()

        vetorInput[posicao] = numero
        posicao++
    }

    vetorInput.forEach { numero ->
        if ((numero % 2) == 0) {
            vetorPar.add(numero)
        }
    }

    vetorPar.forEach { numero -> println(numero) }
}