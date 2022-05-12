package aula13

fun main() {
    print("Informe quantos termos você quer rodar o Fibonacci: ")
    val quantidadeTermos = readln().toInt()
    var num1 = 0
    var num2 = 1

    println(num2)
    println(num1)

    for (i in 0..quantidadeTermos) {
        num2 += num1
        num1 = num2 - num1
    }

    println("O valor do $quantidadeTermos º termo é: $num2")
}