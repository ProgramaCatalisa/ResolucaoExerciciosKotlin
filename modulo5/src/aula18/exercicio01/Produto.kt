package aula18.exercicio01

/*Além disso, seu programa deverá conter uma classe Produto com os atributos de nome do produto, valor e quantidade.*/
class Produto(internal val nome: String, valor: Double, quantidade: Int) {
    internal var valor = valor
        set(value) {
            if (value < 0) {
                print("Não é permitido valor de produto menor que zero")
            } else {
                field = value
            }

        }

    internal var quantidade = quantidade
        set(value) {
            if (value < 0) {
                print("Não é permitido quantidade de produto menor que zero")
            } else {
                field = value
            }

        }
}
