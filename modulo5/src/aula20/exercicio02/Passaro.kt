package aula20.exercicio02

class Passaro(private val nome: String, private val raca: String, private val tipoDoBico: String) : Animal(nome, raca) {
    internal fun mostrarNome() {
        super.printarNome()
    }
}