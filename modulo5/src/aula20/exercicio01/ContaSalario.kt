package aula20.exercicio01

class ContaSalario(tipo: String = "salário") : Conta(tipo) {
    internal fun printarInfosConta() {
        printarInformacoes()
    }
}