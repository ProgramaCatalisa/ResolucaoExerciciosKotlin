package aula20.exercicio05

open class TimeEsportivo(
    private val nome: String,
    private val quantidadeJogadores: Int,
    private val vitorias: Int,
    private val esporte: String
) {
    protected fun printarTime() {
        println("Time: $nome | Quantidade de jogadores: $quantidadeJogadores | Total de vitórias: $vitorias | Esporte relacionado: $esporte")
    }
}