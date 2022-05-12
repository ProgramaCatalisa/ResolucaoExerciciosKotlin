package aula13

import java.time.LocalDate

fun main() {
    val anoAtual = LocalDate.now().year

    print("Digite o ano em que você nasceu: ")
    var ano = readln().toInt()
    var idade = 0

    while (ano <= anoAtual) {
        println("No ano $ano você tinha/tem $idade")
        ano++
        idade++
    }
}