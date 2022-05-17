package aula23.exercicio01e02

fun main() {
/*Definir e inicializar uma nova LISTA vazia. Adicionar os seguintes elementos à lista vazia: [1,5,5,6,7,8,8,8].
Imprimir o resultado na tela.*/
    val lista: ArrayList<Int> = ArrayList()
    lista.add(1)
    lista.add(5)
    lista.add(5)
    lista.add(6)
    lista.add(7)
    lista.add(8)
    lista.add(8)
    lista.add(8)
    println("=======Print da Lista=======")
    lista.forEach { numero -> println(numero) }

/*Definir e inicializar um novo CONJUNTO vazio. Adicionar os seguintes elementos ao conjunto vazio: {1,5,5,6,7,8,8,8}.
Imprimir o resultado na tela. Qual é a diferença entre este exercício e o anterior?*/
    val conjunto: HashSet<Int> = HashSet()
    conjunto.add(1)
    conjunto.add(5)
    conjunto.add(5)
    conjunto.add(6)
    conjunto.add(7)
    conjunto.add(8)
    conjunto.add(8)
    conjunto.add(8)

    println("=======Print do Conjunto=======")
    conjunto.forEach { numero -> println(numero) }
}