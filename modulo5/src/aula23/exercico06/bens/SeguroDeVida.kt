package aula23.exercico06.bens

import aula23.exercico06.interfaces.Tributavel

class SeguroDeVida : Tributavel {
    override fun calcularTributo(): Double {
        return 42.0
    }
}