package aula18.exercicio03

class Alune() {
    private var nome: String = ""
    private var nota1: Double = 0.0
        /*O programa só aceitará notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.*/
        set(value) {
            if (value < 0 || value > 10) {
                println("A nota deve estar entre 0 e 10, tente novamente")
                this.capturarNotas()
            } else {
                field = value
            }
        }
    private var nota2: Double = 0.0
        /*Cada nota deve ser validada separadamente*/
        set(value) {
            if (value < 0 || value > 10) {
                println("A nota deve estar entre 0 e 10, tente novamente")
                this.capturarNotas()
            } else {
                field = value
            }
        }
    private var nota3: Double = 0.0
        set(value) {
            if (value < 0 || value > 10) {
                println("A nota deve estar entre 0 e 10, tente novamente")
                this.capturarNotas()
            } else {
                field = value
            }
        }
    private var nota4: Double = 0.0
        set(value) {
            if (value < 0 || value > 10) {
                println("A nota deve estar entre 0 e 10, tente novamente")
                this.capturarNotas()
            } else {
                field = value
            }
        }

    internal fun capturarNome() {
        print("Digite o nome da pessoa: ")
        this.nome = readln()
    }

    internal fun capturarNotas() {
        print("Digite a nota 1 da pessoa: ")
        this.nota1 = readln().toDouble()

        print("Digite a nota 2 da pessoa: ")
        this.nota2 = readln().toDouble()

        print("Digite a nota 3 da pessoa: ")
        this.nota3 = readln().toDouble()

        print("Digite a nota 4 da pessoa: ")
        this.nota4 = readln().toDouble()
    }

    /* Calcule e imprima a média semestral.*/
    internal fun calcularMedia() {
        val media = (nota1 + nota2 + nota3 + nota4) / 4
        println("A média de $nome foi $media")
    }
}