package aula20.exercicio03

open class Produto(private val nome: String, private val codigoBarras: String) {
    protected fun printarProduto() {
        println("Produto: $nome | Código: $codigoBarras")
    }
}