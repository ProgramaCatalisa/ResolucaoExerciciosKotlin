package aula23.exercico06.bens

import aula23.exercico06.interfaces.Tributavel

class ContaPoupanca : Tributavel {
    override fun calcularTributo(): Double {
        return 0.0
    }
}