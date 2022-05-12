package aula14

/*Exercício 03 da parte 'Exercícios gerais'*/
fun main() {
    print(
        "Digite o nome da pessoa vendedora," +
                "\no salário fixo e " +
                "\no total de vendas separado por vírgula: "
    )

    val input = readln()

    calcularComissao(input)
}

fun calcularComissao(input: String) {
    val vetor = input.split(",")

    val nome: String = vetor[0]
    val salarioFixo: Double = vetor[1].toDouble()
    val totalVendas: Double = vetor[2].toDouble()

    val comissao = 0.15
    val comissaoSobreVendas: Double = comissao * totalVendas
    val salarioTotal: Double = salarioFixo + comissaoSobreVendas

    println("A pessoa vendedora $nome, vendeu $totalVendas e o salário no final do mês será de R$$salarioTotal")

}
