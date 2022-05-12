package aula17.exercicio01

class Funcionario {
    var nome: String = ""
    var sobrenome: String = ""
    var horasTrabalhadas: Double = 0.0
    var valorPorHora: Double = 0.0

    fun nomeCompleto() {
        println("O nome completo de funcionario é: $nome $sobrenome")
    }

    fun calcularSalario() {
        val salario = horasTrabalhadas * valorPorHora
        println("Esse mês a pessoa $nome receberá R$$salario")
    }

    fun incrementarHoras(incremento: Double) {
        horasTrabalhadas += incremento
    }
}