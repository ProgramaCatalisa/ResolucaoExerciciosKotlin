package aula22.exercicio02

import aula22.exercicio02.circulo.Circulo
import aula22.exercicio02.classeabstrata.Forma
import aula22.exercicio02.retangulo.Retangulo
import aula22.exercicio02.retangulo.subclasse.Quadrado

fun main() {
    val formas: ArrayList<Forma> = ArrayList()

    val circulo01 = Circulo(2f)
    val quadrado01 = Quadrado(2f)
    val retangulo01 = Retangulo(2f, 6f)
    val quadrado02 = Quadrado(5f)
    val retangulo02 = Retangulo(6f, 20f)

    formas.add(circulo01)
    formas.add(quadrado01)
    formas.add(retangulo01)
    formas.add(quadrado02)
    formas.add(retangulo02)

    verAreaEPerimetro(formas)
}

fun verAreaEPerimetro(formas: ArrayList<Forma>) {
    formas.forEachIndexed { index, forma ->
        val area = forma.calcularArea()
        val perimetro = forma.calcularPerimetro()

        println("A forma $index tem área $area e perímetro $perimetro")
    }
}
