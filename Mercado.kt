class Mercado(
    val nome: String = "Mercado XYZ", // Nome do mercado
    val localizacao: String = "Centro", // Localização do mercado
    val numeroDeFuncionarios: Int = 10, // Número de funcionários
    val estoque: MutableMap<String, Int> = mutableMapOf("Arroz" to 100, "Feijão" to 150) // Estoque do mercado
) {

    fun venderProduto(produto: String, quantidade: Int): String {
        val estoqueAtual = estoque[produto] ?: 0
        return if (estoqueAtual >= quantidade) {
            estoque[produto] = estoqueAtual - quantidade
            "Venda realizada! $quantidade unidades de $produto vendidas."
        } else {
            "Estoque insuficiente de $produto. Só temos $estoqueAtual unidades."
        }
    }

    fun imprimirAtributos() {
        println()
        println("Nome: $nome")
        println("Localização: $localizacao")
        println("Número de Funcionários: $numeroDeFuncionarios")
        println("Estoque:")
        for ((produto, quantidade) in estoque) {
            println("  - $produto: $quantidade unidades")
        }
        println()
    }
}
