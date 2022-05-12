package aula14

/*Exercício 05 da parte 'Exercícios gerais'*/
fun main() {
    converterTemperatura()
}

fun converterTemperatura() {
    print("Informe a temperatura em graus Celsius: ")
    val temperaturaCelsius = readln().toDouble()

    val temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5

    print("A temperatura em Fahrenheit é: $temperaturaFahrenheit")
}
