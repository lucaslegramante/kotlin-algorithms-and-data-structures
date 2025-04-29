package org.example.semana1Fundamentos

fun calcularSoma(lista: List<Int>): Int = lista.sum()

fun calcularMedia(lista: List<Int>): Double = lista.average()

fun encontrarMaior(lista: List<Int>): Int? = lista.maxOrNull()

fun encontrarMenor(lista: List<Int>): Int? = lista.minOrNull()

fun filtrarPares(lista: List<Int>): List<Int> = lista.filter { it % 2 == 0 }

fun retornaPrimo(numero: Int): List<Int> {
    val listaPrimos = mutableListOf<Int>()
    for (i in 2..numero) {
        if (i == 2) {
            listaPrimos.add(i)
        } else {
            var isPrimo = true
            for (j in 2 until i) {
                if (i % j == 0) {
                    isPrimo = false
                    break
                }
            }
            if (isPrimo) {
                listaPrimos.add(i)
            }
        }
    }

    return listaPrimos
}


fun retornaPrimo2(numero: Int): List<Int> {
    val listaPrimos = mutableListOf<Int>()
    for (i in 2..numero) {
        if(i == 2){
            listaPrimos.add(i)
        }
        if (i % 2 == 0 || i % 3 == 0) {
            continue
        }else listaPrimos.add(i)


    }
    return listaPrimos
}

fun ordenarLista(lista: List<Int>): List<Int> = lista.sorted()

fun ordenarListaManual(lista: List<Int>): List<Int> {
    val listaOrdenada = mutableListOf<Int>()
    val listaCopia = lista.toMutableList()

    while (listaCopia.isNotEmpty()) {
        val menor = listaCopia.minOrNull()
        menor?.let {
            listaOrdenada.add(it)
            listaCopia.remove(it)
        }
    }

    return listaOrdenada
}

fun numeroAmstrong(numero: Int): Boolean {
    val numeroString = numero.toString()
    val tamanho = numeroString.length
    var soma = 0
    for (i in numeroString) {
        val num = i.toString().toInt()
        soma += Math.pow(num.toDouble(), tamanho.toDouble()).toInt()
    }

    return soma == numero
}

fun main() {
    println("Calculando a soma: ${calcularSoma(listOf(3, 10, 7, 2, 8, 5, 1))}")
    println("Filtrando os pares: ${filtrarPares(listOf(3, 10, 7, 2, 8, 5, 1))}")
    println("Calculando a média: ${calcularMedia(listOf(3, 10, 7, 2, 8, 5, 1))}")
    println("Encontrando o maior: ${encontrarMaior(listOf(3, 10, 7, 2, 8, 5, 1))}")
    println("Encontrando o menor: ${encontrarMenor(listOf(3, 10, 7, 2, 8, 5, 1))}")
    println("Encontrando os primos: ${retornaPrimo(13)}")
    println("Encontrando os primos2 : ${retornaPrimo2(13)}")
    println("Ordenando a lista: ${ordenarLista(listOf(3, 10, 7, 2, 8, 5, 1))}")
    println("Ordenando a lista manualmente: ${ordenarListaManual(listOf(3, 10, 7, 2, 8, 5, 1))}")
}
