package aula20.exercicio06

import java.time.LocalDate

class Analista(
    nome: String,
    sobreNome: String,
    setor: Setor,
    salario: Double,
    dataAdmissao: LocalDate,
    private val nivel: Int
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