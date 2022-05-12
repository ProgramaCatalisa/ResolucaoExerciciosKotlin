package aula13

fun main() {
    var contador = 1
    val listaMusicas = ArrayList<String>(3)

    print("Digite o nome da banda: ")
    val nomeBanda = readln()

    while (contador != 4) {
        print("Digite a $contador ª música de $nomeBanda: ")
        val musica = readln()
        listaMusicas.add(musica)
        contador++
    }

    println("As músicas de $nomeBanda, são:")
    listaMusicas.forEach { musica -> println(musica) }
}