package aula12

fun main() {
    /*A cotação do dólar hoje (11/05) está em R$ 5,11*/
    val cotacao = 5.11

    print("Digite o valor monetário em dólar(US$) a ser convertido para reais(R$): ")
    val valor = readln().toDouble()

    val valorConvertido = valor * cotacao

    print("O valor US$$valor em reais é R$$valorConvertido")
}