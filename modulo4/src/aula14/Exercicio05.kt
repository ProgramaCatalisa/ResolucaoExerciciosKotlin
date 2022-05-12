package aula14

/*Exercício 01 da parte 'Exercícios gerais'*/
fun main() {

    calcularDoisNumeros()
}

fun calcularDoisNumeros() {
    print("Informe o primeiro número: ")
    val primeiroNumero = readln().toDouble()

    print("Informe o segundo número: ")
    val segundoNumero = readln().toDouble()

    println("Digite qual operação deseja realizar")
    println("1. Somar")
    println("2. Subtrair")
    println("3. Multiplicar")
    println("4. Dividir")
    val opcao = readln().toInt()

    when (opcao) {
        1 -> {
            val soma = primeiroNumero + segundoNumero
            println("A soma é: $soma")
        }
        2 -> {
            val subtracao = primeiroNumero - segundoNumero
            println("A subtração é: $subtracao")
        }
        3 -> {
            val multiplicacao = primeiroNumero * segundoNumero
            println("A multiplicação é: $multiplicacao")
        }
        4 -> {
            if (segundoNumero == 0.0) {
                print("Para divisão o segundo número não pode ser igual a 0")
            } else {
                val divisao = primeiroNumero / segundoNumero
                println("A divisão é: $divisao")
            }

        }
        else -> {
            print("Opção inválida")
        }
    }
}
