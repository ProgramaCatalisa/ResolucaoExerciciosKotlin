package aula23.exercico06.bens

import aula23.exercico06.interfaces.Tributavel

class ContaCorrente : Tributavel {
    var saldo = 0.0
    override fun calcularTributo(): Double {
        return saldo/100
    }
}