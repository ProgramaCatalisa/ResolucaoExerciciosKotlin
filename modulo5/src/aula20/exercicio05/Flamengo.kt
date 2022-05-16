package aula20.exercicio05

class Flamengo(nome: String, quantidadeJogadores: Int, vitorias: Int, esporte: String) : TimeEsportivo(
    nome, quantidadeJogadores, vitorias,
    esporte
) {
    internal fun mostrarInformacoes() {
        printarTime()
    }
}