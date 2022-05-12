package aula13

fun main() {
    /*Nesse programa vamos considerar que a semana começa no domingo*/

    print("Digite um número de 1 a 7 para saber o dia da semana: ")
    val numero = readln().toInt()

    when (numero) {
        1 -> print("O dia da semana é domingo")
        2 -> print("O dia da semana é segunda")
        3 -> print("O dia da semana é terça")
        4 -> print("O dia da semana é quarta")
        5 -> print("O dia da semana é quinta")
        6 -> print("O dia da semana é sexta")
        7 -> print("O dia da semana é sábado")
        else -> print("Informação inválida, tente novamente")
    }
}