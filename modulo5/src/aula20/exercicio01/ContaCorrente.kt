package aula20.exercicio01

class ContaCorrente(tipo: String = "corrente") : Conta(tipo) {
    internal fun printarInfosConta() {
        printarInformacoes()
    }
}