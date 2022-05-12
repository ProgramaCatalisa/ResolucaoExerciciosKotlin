package aula13

fun main() {
    print("Digite quantos itens deseja inserir na lista de compras: ")
    var quantidade = readln().toInt()

    val listaCompra = ArrayList<String>(quantidade)

    while (quantidade > 0) {
        println("Informe o item a ser adicionado na lista: ")
        val item = readln()
        listaCompra.add(item)
        quantidade--
    }

    println("Os itens adicionados foram: ")
    listaCompra.forEach { item -> println("* $item") }
}