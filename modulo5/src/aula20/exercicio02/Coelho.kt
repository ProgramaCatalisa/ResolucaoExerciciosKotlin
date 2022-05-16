package aula20.exercicio02

class Coelho(private val nome: String, private val raca: String, private val pelagem:String) : Animal(nome, raca) {
    internal fun mostrarNome() {
        super.printarNome()
    }
}