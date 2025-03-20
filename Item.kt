class Item(val nome: String, val categoria: String, var preco: Double, var estoque: Int) {

    fun aplicarDesconto(percentual: Double) {
        preco -= preco * (percentual / 100)
    }

    fun adicionarEstoque(quantidade: Int) {
        estoque += quantidade
    }
}
