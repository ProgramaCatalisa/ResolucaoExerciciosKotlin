package aula12

fun main() {
    print("Digite o número que deseja verificar se é múltiplo de 5: ")
    val numero = readln().toInt()

    if ((numero % 5) == 0) {
        print("O número $numero é múltiplo de 5")
    } else {
        print("O número $numero NÃO é múltiplo de 5")
    }
}