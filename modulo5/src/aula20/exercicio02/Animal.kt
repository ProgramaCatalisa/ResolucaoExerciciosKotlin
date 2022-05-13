package aula20.exercicio02

open class Animal(private val nome: String, private val raca: String) {
    protected fun printarNome() {
        println("Meu nome é $nome")
    }
}