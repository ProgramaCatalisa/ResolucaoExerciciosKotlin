package aula25.exercicio01

class CalculoMatematico {

    fun divisao (a:Int, b:Int) : Int{
        try {
            return a/b
        } catch (exception:ArithmeticException){
            println("DEU RUIM!!!")
            return 0
        }
    }
}