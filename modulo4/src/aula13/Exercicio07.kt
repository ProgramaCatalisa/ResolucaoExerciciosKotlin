package aula13

fun main() {
    print("Digite a quantidade de alunes na turma: ")
    val quantidade = readln().toInt()
    val listaNotas = DoubleArray(quantidade)
    var contador = 0

    while (contador != quantidade) {
        print("Digite a nota da ${contador + 1} ª pessoa: ")
        val nota = readln().toDouble()
        listaNotas[contador] = nota
        contador++
    }

    val media = listaNotas.average()

    print("A média da turma é $media")

}