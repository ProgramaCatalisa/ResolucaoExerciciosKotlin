package aula23.exercicio05

fun main() {
    val dicionario = Dicionario().mapa
    dicionario.forEach { (cor, objeto) -> println("$objeto = $cor") }
}