package aula20.exercicio01

class ContaPoupanca(tipo: String = "poupança") : Conta(tipo) {
    internal fun printarInfosConta() {
        printarInformacoes()
    }
}