package aula14

fun main() {
    conversorMoeda()
}

fun conversorMoeda() {
    print("Digite o valor da cotação do dólar hoje: ")
    val cotacao = readln().toDouble()

    print("Digite o valor monetário em dólar(US$) a ser convertido para reais(R$): ")
    val valor = readln().toDouble()

    val valorConvertido = valor * cotacao

    print("O valor US$$valor em reais é R$$valorConvertido")
}
