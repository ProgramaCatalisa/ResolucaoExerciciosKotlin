package aula20.exercicio03

import java.time.LocalDate

fun main() {
    val produtoLimpeza = ProdutoLimpeza("desinfetante", "1234ba", LocalDate.of(2023, 12, 25), "cozinha")
    produtoLimpeza.mostrarProduto()

    val comida = Alimento("presunto", "iuyh12", LocalDate.of(2024, 2, 17), "processado")
    comida.mostrarProduto()

    val utensilio = UtensilioDomestico("conjunto de talher", "oiuyhjk34", true)
    utensilio.mostrarProduto()
}