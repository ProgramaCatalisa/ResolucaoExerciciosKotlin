package aula18.exercicio02

import aula18.exercicio01.Menu.Companion.menu
import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Pessoa() {
    private var idade: Int = 0
    private var dia: Int = 0
    private var mes: Int = 0
    private var anoNascimento: Int = 0
    private var nome: String = ""

    internal fun preencherDados() {
        print("Informe o nome da pessoa: ")
        val nomeInput = readln()

        print("Informe o dia de nascimento da pessoa: ")
        val diaInput = readln().toInt()

        print("Informe o mes de nascimento da pessoa: ")
        val mesInput = readln().toInt()

        print("Informe o ano de nascimento da pessoa: ")
        val anoInput = readln().toInt()

        informarNome(nomePreencher = nomeInput)
        ajustaDataDeNascimento(diaAjustar = diaInput, mesAjustar = mesInput, anoAjustar = anoInput)

    }

    internal fun calcularIdade() {
        if (dia == 0 || mes == 0 || anoNascimento == 0) {
            println("Algum dado da data de nascimento foi inserido de forma inválida, por favor, tente novamente")
            menu()
        } else {
            val dataAtual = LocalDate.now()
            val dataNascimento = LocalDate.of(anoNascimento, mes, dia)
            /*
            *A forma de calcular a idade abaixo foi resultado de uma pesquisa na documentação/fórum do Kotlin
            * @see https://discuss.kotlinlang.org/t/calculate-no-of-days-between-two-dates-kotlin/9826
            * */
            this.idade = ChronoUnit.YEARS.between(dataNascimento, dataAtual).toInt()
            println(idade)
        }
    }

    internal fun informarIdade(): Int {
        println("$nome tem/teria $idade anos hoje")
        return idade
    }

    private fun informarNome(nomePreencher: String): String {
        this.nome = nomePreencher
        println("O nome é $nomePreencher")

        return this.nome
    }

    private fun ajustaDataDeNascimento(diaAjustar: Int, mesAjustar: Int, anoAjustar: Int) {
        this.dia = diaAjustar
        this.mes = mesAjustar
        this.anoNascimento = anoAjustar
    }
}