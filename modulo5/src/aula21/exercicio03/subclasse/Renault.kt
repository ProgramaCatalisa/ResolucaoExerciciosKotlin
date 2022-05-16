package aula21.exercicio03.subclasse

import aula21.exercicio03.enum.Portas
import aula21.exercicio03.superclasse.Carro

class Renault(
    marca: String = "Renault",
    ano: Int,
    valor: Double,
    cor: String,
    portas: Portas,
    private var velocidade: Double = 0.0
) :
    Carro(
        marca, ano, valor, cor, portas,
        velocidade
    ) {
    public override fun iniciarMotor() {
        println("Iniciando o motor… minha velocidade está em $velocidade")
    }

    public override fun frear() {
        if (velocidade <= 0.0) {
            println("O carro já está parado")
        } else {
            velocidade -= 5.0
            println("Freando… minha velocidade está em $velocidade")
        }
    }

    public override fun acelerar() {
        if (velocidade < 0.0) {
            println("Inicie o motor antes de acelerar")
        } else {
            velocidade += 10.0
            println("Acelerando… minha velocidade está em $velocidade")
        }
    }
}