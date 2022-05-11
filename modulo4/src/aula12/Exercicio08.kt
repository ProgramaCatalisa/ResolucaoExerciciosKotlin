package aula12

fun main() {
    var z = ""
    print("Digite o valor de x: ")
    var x = readln()

    print("Digite o valor de y: ")
    var y = readln()
    z = x
    x = y
    y = z

    println("O valor de x: $x")
    println("O valor de y: $y")
}