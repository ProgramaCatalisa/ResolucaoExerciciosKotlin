package aula14

/*Exercício 02 da parte 'Exercícios gerais'*/
fun main() {
    print("Informe a quantidade de números a serem comparados: ")
    val quantidade = readln().toInt()

    encontrarMenorNumero(quantidade)
}

fun encontrarMenorNumero(quantidade: Int) {
    val listaNumeros = IntArray(quantidade)

    listaNumeros.forEachIndexed() { index, _ ->
        print("Digite o número a ser inserido na lista: ")
        listaNumeros[index] = readln().toInt()
    }

    val menorNumero = listaNumeros.minOrNull()
    print("O menor número digitado foi $menorNumero")
}
