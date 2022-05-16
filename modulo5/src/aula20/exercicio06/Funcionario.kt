package aula20.exercicio06

import java.time.LocalDate

open class Funcionario(
    private val nome: String,
    private val sobreNome: String,
    private val setor: Setor,
    private val salario: Double,
    private val dataAdmissao: LocalDate
) {
    protected fun printarInformacoesFuncionario() {
        println("Nome completo: $nome $sobreNome")
        println("Setor: $setor")
        println("Admissão em: $dataAdmissao")
        println("Salário de: $salario")
    }
}