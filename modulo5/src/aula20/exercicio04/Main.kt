package aula20.exercicio04

fun main() {
    val livroRomance = Romance()
    livroRomance.mostrarInformacoes()

    livroRomance.titulo = "Dom Casmurro"
    livroRomance.pessoaAutora.nome = "Machado de Assis"
    livroRomance.pessoaAutora.email = "email@email.com"

    livroRomance.mostrarInformacoes()

    val livroSuspense = Suspense()
    livroSuspense.mostrarInformacoes()

    livroSuspense.titulo = "O Estranho"
    livroSuspense.pessoaAutora.nome = "Harlan Coben"
    livroSuspense.pessoaAutora.email = "hc@email.com"

    livroSuspense.mostrarInformacoes()

    val livroTerror = Terror()
    livroTerror.mostrarInformacoes()

    livroTerror.titulo = "It: a coisa"
    livroTerror.pessoaAutora.nome = "Stephen King"
    livroTerror.pessoaAutora.email = "ksk@email.com"

    livroTerror.mostrarInformacoes()
}