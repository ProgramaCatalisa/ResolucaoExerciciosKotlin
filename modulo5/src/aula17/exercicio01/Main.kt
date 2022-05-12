package aula17.exercicio01

fun main() {
    testarFuncionario()
    val listaFuncionario = criarListaFuncionarios()
    printarFuncionarios(listaFuncionario)
}

fun testarFuncionario() {
    val funcionario = Funcionario()
    funcionario.nome = "Luis"
    funcionario.sobrenome = "Silva"
    funcionario.horasTrabalhadas = 10.0
    funcionario.valorPorHora = 25.5

    funcionario.nomeCompleto()
    funcionario.calcularSalario()
    funcionario.incrementarHoras(incremento = 8.0)
    funcionario.calcularSalario()
}

fun criarListaFuncionarios(): ArrayList<Funcionario> {
    val listaFuncionario: ArrayList<Funcionario> = ArrayList()

    val funcionario1 = Funcionario()
    funcionario1.nome = "Ana"
    funcionario1.sobrenome = "Silva"
    funcionario1.horasTrabalhadas = 10.0
    funcionario1.valorPorHora = 25.5

    listaFuncionario.add(funcionario1)

    val funcionario2 = Funcionario()
    funcionario2.nome = "Beto"
    funcionario2.sobrenome = "Silva"
    funcionario2.horasTrabalhadas = 10.0
    funcionario2.valorPorHora = 25.5

    listaFuncionario.add(funcionario2)

    val funcionario3 = Funcionario()
    funcionario3.nome = "Caique"
    funcionario3.sobrenome = "Silva"
    funcionario3.horasTrabalhadas = 10.0
    funcionario3.valorPorHora = 25.5

    listaFuncionario.add(funcionario3)

    val funcionario4 = Funcionario()
    funcionario4.nome = "Diega"
    funcionario4.sobrenome = "Silva"
    funcionario4.horasTrabalhadas = 10.0
    funcionario1.valorPorHora = 25.5

    listaFuncionario.add(funcionario4)

    val funcionario5 = Funcionario()
    funcionario5.nome = "Elio"
    funcionario5.sobrenome = "Silva"
    funcionario5.horasTrabalhadas = 10.0
    funcionario5.valorPorHora = 25.5

    listaFuncionario.add(funcionario5)

    val funcionario6 = Funcionario()
    funcionario6.nome = "Fernanda"
    funcionario6.sobrenome = "Silva"
    funcionario6.horasTrabalhadas = 10.0
    funcionario6.valorPorHora = 25.5

    listaFuncionario.add(funcionario6)

    val funcionario7 = Funcionario()
    funcionario7.nome = "George"
    funcionario7.sobrenome = "Silva"
    funcionario7.horasTrabalhadas = 10.0
    funcionario7.valorPorHora = 25.5

    listaFuncionario.add(funcionario7)

    val funcionario8 = Funcionario()
    funcionario8.nome = "Herminia"
    funcionario8.sobrenome = "Silva"
    funcionario8.horasTrabalhadas = 10.0
    funcionario8.valorPorHora = 25.5

    listaFuncionario.add(funcionario8)

    val funcionario9 = Funcionario()
    funcionario9.nome = "Italo"
    funcionario9.sobrenome = "Silva"
    funcionario9.horasTrabalhadas = 10.0
    funcionario9.valorPorHora = 25.5

    listaFuncionario.add(funcionario9)

    return listaFuncionario
}

fun printarFuncionarios(listaFuncionario: ArrayList<Funcionario>) {
    listaFuncionario.forEach { funcionario ->
        println("As pessoas criadas foram: ")
        println(funcionario.nomeCompleto())
        println(funcionario.calcularSalario())
        println("========================")
    }
}
