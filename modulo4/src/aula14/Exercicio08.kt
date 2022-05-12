package aula14

/*Exercício 04 da parte 'Exercícios gerais'*/
fun main() {
    print("Informe a quantidade de alunes a turma tem: ")
    val quantidadeAlunos = readln().toInt()

    val turma = receberDadosAlune(quantidadeAlunos)
    val medias = calcularMedia(quantidadeAlunos, turma)
    printarMedias(turma, medias)

}

fun receberDadosAlune(quantidadeAlunos: Int): ArrayList<String> {

    val turma = ArrayList<String>()

    var contador = 0

    while (contador < quantidadeAlunos) {
        print("Informe o nome da pessoa número ${contador + 1}: ")
        val nome = readln()
        turma.add(nome)
        contador++
    }

    return turma
}

fun calcularMedia(quantidadeAlunos: Int, turma: ArrayList<String>): DoubleArray {
    val medias = DoubleArray(quantidadeAlunos)

    turma.forEachIndexed { index, alune ->
        print("Digite a primeira nota de $alune: ")
        val nota1 = readln().toDouble()

        print("Digite a segunda nota de $alune: ")
        val nota2 = readln().toDouble()

        print("Digite a terceira nota de $alune: ")
        val nota3 = readln().toDouble()
        val media = (nota1 + nota2 + nota3) / 3
        medias[index] = media
    }
    return medias
}

fun printarMedias(turma: ArrayList<String>, medias: DoubleArray) {
    turma.forEachIndexed { index, alune ->
        println("Alune $alune teve média ${medias[index]}")
    }
}
