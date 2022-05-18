package aula23.exercicio03.guardavolumes

import aula23.exercicio03.classeabstrata.Peca

class GuardaVolumes() {
    private val dicionario: HashMap<Int, List<Peca>> = HashMap()
    private var identificador: Int = 0

    internal fun guardarPecas(listaDePeca: ArrayList<Peca>): Int {
        dicionario[identificador] = ArrayList(listaDePeca)
        identificador++
        return identificador - 1
    }

    internal fun mostrarPeca() {
        if (dicionario.isEmpty()) {
            println("Não tem nenhum item cadastrado ainda")
        } else {
            dicionario.forEach { (identificador, listaDePeca) ->
                println("Código: $identificador | Lista: ")
                println("${listaDePeca.forEach { peca -> println("Marca: ${peca.marca} e Modelo: ${peca.modelo}") }} \n")
            }
        }
    }

    internal fun mostrarPeca(numero: Int) {
        if (dicionario.containsKey(numero)) {
            val listaProcurada = dicionario[numero]

            if (!listaProcurada.isNullOrEmpty()) {
                println("O volume ${numero} contém a(s) peça(s) a seguir:")
                listaProcurada.forEach { peca -> println("Marca: ${peca.marca} e Modelo: ${peca.modelo}") }
            } else {
                println("O código foi encontrado, porém não tem lista cadastrada")
            }
        } else {
            println("Código não encontrado")
        }
    }

    internal fun devolverPecas(numero: Int) {
        if (dicionario.containsKey(numero)) {
            dicionario.remove(numero)
            println("Item removido com sucesso")
        } else {
            println("Código não encontrado")
        }
    }
}