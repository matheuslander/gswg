fun main() {
    executarExercicios()
    mercados()
}

fun executarExercicios() {
    ex1()
    ex2()
    ex3(2, 4)
    ex4(100, 10)
    ex4(1, 7)
}

fun mercados() {

    val mercados = listOf(
        Mercado(nome = "Mercado do Bairro", localizacao = "Bairro A", numeroDeFuncionarios = 15, estoque = mutableMapOf("Arroz" to 200, "Feijão" to 100)),
        Mercado(nome = "Supermercado Central", localizacao = "Centro", numeroDeFuncionarios = 30, estoque = mutableMapOf("Arroz" to 50, "Feijão" to 200)),
        Mercado(nome = "Mini Mercado", localizacao = "Rua X", numeroDeFuncionarios = 5, estoque = mutableMapOf("Arroz" to 80, "Feijão" to 120))
    )

    for (mercado in mercados) {
        mercado.imprimirAtributos()
    }
}

// 1

fun ex1() {
    val n = 10
    for (i in 0 until n) {
        println("Índice: ${i}")
    }
}

// 2

fun ex2() {
    val n = 10;
    for (i in 0 until n) {
        if (i % 2 != 0) {
            println("Índices ímpares: ${i}")
        }
    }
}

// 3

fun ex3(a: Int, b: Int): Int {
    return if (a % 2 == 0 && b % 2 == 0) {
        a + b
    } else {
        a * b
    }
}

// 4

fun ex4(a: Int, b: Int): Int {
    if (a in 10..99) {
        return a + b
    } else if (a in 100..999) {
        return a / b
    } else if (a in 1000..99999) {
        return a - b
    } else if (a in 1..9) {
        return a * b
    } else {
        return 0
    }
}
