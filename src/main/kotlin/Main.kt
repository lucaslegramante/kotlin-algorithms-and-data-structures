package org.example

fun calcularSoma(lista: List<Int>): Int = lista.sum()

fun calcularMedia(lista: List<Int>): Double = lista.average()

fun encontrarMaior(lista: List<Int>): Int? = lista.maxOrNull()

fun encontrarMenor(lista: List<Int>): Int? = lista.minOrNull()

fun filtrarPares(lista: List<Int>): List<Int> = lista.filter { it % 2 == 0 }

fun main() {
    println("Hello World!")
}
