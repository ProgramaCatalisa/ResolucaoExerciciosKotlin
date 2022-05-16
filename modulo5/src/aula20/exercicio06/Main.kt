package aula20.exercicio06

import java.time.LocalDate

fun main() {
    val funcionario01 = Coordenador("Ada", "Lovelace", Setor.CONTABILIDADE, 50000.0, LocalDate.of(2020, 2, 1), true)
    funcionario01.mostrarInformacoes()

    val funcionario02 = JovemAprendiz("Lord", "Byron", Setor.RH, 750.0, LocalDate.of(2022, 10, 14), "São Paulo")
    funcionario02.mostrarInformacoes()

    val funcionario03 = Analista("Uncle", "Bob", Setor.OPERACOES, 1200.0, LocalDate.of(2021, 4, 20), 4)
    funcionario03.mostrarInformacoes()
}