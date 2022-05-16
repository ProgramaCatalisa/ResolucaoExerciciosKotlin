package aula20.exercicio02

fun main() {
    val animal1: Coelho = Coelho("nino", "Angorá", "branco")
    val animal2: Passaro = Passaro("benti", "Bem-te-vi", "curto")
    val animal3: Roedor = Roedor("hamtaro", "hamster")

    animal1.mostrarNome()
    animal2.mostrarNome()
    animal3.mostrarNome()
}