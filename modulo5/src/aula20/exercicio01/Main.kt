package aula20.exercicio01

fun main() {
    val contaSalario = ContaSalario()
    contaSalario.nomeCliente = "Clara"
    contaSalario.saldo = 1000.0
    contaSalario.printarInfosConta()

    val contaPoupanca = ContaPoupanca()
    contaPoupanca.nomeCliente = "João"
    contaPoupanca.saldo = 500.0
    contaPoupanca.printarInfosConta()

    val contaCorrente = ContaCorrente()
    contaCorrente.nomeCliente = "Zuleide"
    contaCorrente.saldo = -10.0
    contaCorrente.printarInfosConta()
}