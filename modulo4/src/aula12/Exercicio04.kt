package aula12

fun main() {
    print("Digite a temperatura para saber o tipo do clima: ")
    val temperatura = readln().toDouble()

    if (temperatura <= 18) {
        print("O clima está frio!")
    } else if ((temperatura > 18) && (temperatura <= 23)) {
        print("O clima está agradável!")
    } else if ((temperatura > 23) && (temperatura <= 35)) {
        print("O clima está quente!")
    } else {
        print("O clima está muito quente!")
    }

}