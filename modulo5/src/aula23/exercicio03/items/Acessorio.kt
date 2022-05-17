package aula23.exercicio03.items

import aula23.exercicio03.classeabstrata.Peca

class Acessorio(marca: String, modelo: String, tipo: String) : Peca(marca, modelo) {
    override fun retirar() {
        TODO("Not yet implemented")
    }
}