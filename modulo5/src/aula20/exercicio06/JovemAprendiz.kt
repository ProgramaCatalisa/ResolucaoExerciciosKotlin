package aula20.exercicio06

import java.time.LocalDate

class JovemAprendiz(
    nome: String,
    sobreNome: String,
    setor: Setor,
    salario: Double,
    dataAdmissao: LocalDate,
    private val unidadeSenai: String
) :
    Funcionario(
        nome, sobreNome, setor,
        salario,
        dataAdmissao
    ) {
    internal fun mostrarInformacoes() {
        printarInformacoesFuncionario()
    }
}