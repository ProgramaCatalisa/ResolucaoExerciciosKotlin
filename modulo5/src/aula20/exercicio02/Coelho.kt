package aula20.exercicio02

class Coelho(private val nome: String, private val raca: String) : Animal(nome, raca) {
    internal fun mostrarNome() {
        super.printarNome()
    }
}