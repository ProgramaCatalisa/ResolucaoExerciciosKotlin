package aula20.exercicio01

open class Conta(private val tipo: String) {

    internal var saldo: Double = 0.0
    internal var nomeCliente: String = ""

    protected fun printarInformacoes() {
        println("A conta é do tipo $tipo pertence a $nomeCliente e tem saldo de $saldo")
    }
}