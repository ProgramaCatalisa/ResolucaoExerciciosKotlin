package aula20.exercicio06

import java.time.LocalDate

class Coordenador(
    nome: String,
    sobreNome: String,
    setor: Setor,
    salario: Double,
    dataAdmissao: LocalDate,
    private val acessoRestrito: Boolean
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