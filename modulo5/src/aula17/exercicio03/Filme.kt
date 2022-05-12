package aula17.exercicio03

class Filme(val titulo: String, val duracaoEmMinutos: Int) {

    fun exibirDuracaoHorasMinutos() {
        val horas = duracaoEmMinutos / 60
        val minutos = duracaoEmMinutos % 60
        println("O filme $titulo possui $horas horas e $minutos minutos de duração")
    }

    fun exibirDuracaoEmHoras() {
        val horas = duracaoEmMinutos / 60
        println("O filme $titulo tem duração de $horas horas")
    }

    companion object {
        fun listaFilmesEmCartaz(filme1: Filme, filme2: Filme) {
            println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}")
        }

        fun listaFilmesEmCartaz(listaFilmes: ArrayList<Filme>) {
            println("Os filmes em cartaz são:")
            listaFilmes.forEach { filme ->
                println(filme.titulo)
            }
        }
    }
}