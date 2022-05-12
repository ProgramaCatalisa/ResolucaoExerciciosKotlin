package aula14

fun main() {
    print("Digite seu nome: ")
    val nome = readln()

    printarNomeUsuario(nome)
}

fun printarNomeUsuario(nome: String) {
    print("Meu nome é $nome")
}
