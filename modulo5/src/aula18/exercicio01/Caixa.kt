package aula18.exercicio01

/*O seu programa deverá conter uma classe Caixa, que deverá conter uma lista de produtos*/
open class Caixa {

    private val listaProdutos: ArrayList<Produto> = ArrayList()

    /*essa classe deverá permitir cadastrar produtos*/
    internal fun cadastrarProdutos() {
        println("Digite o nome do produto: ")
        val nome = readln()
        println("Digite o valor do produto: ")
        val valor = readln().toDouble()
        println("Digite a quantidade do produto: ")
        val quantidade = readln().toInt()

        val produto = Produto(nome, valor, quantidade)
        listaProdutos.add(produto)

        println("Produto cadastrado com sucesso!")
    }

    /* exibir os produtos cadastrados*/
    internal fun exibirListaDeProdutos() {
        listaProdutos.forEach { it ->
            println("Produto: ${it.nome} | Quantidade: ${it.quantidade} | Preço: ${it.valor}")
        }
    }

    /*e uma função que irá exibir o valor total da somatória de todos os produtos da lista. */
    internal fun calcularValorCompra() {
        var valorTotal = 0.0

        for (produto: Produto in listaProdutos) {
            val totalProduto = produto.quantidade * produto.quantidade
            valorTotal += totalProduto
        }
        println("O valor da compra é: $valorTotal")
    }
}