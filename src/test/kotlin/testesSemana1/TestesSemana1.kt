package testesSemana1

import org.example.semana1Fundamentos.calcularMedia
import org.example.semana1Fundamentos.calcularSoma
import org.example.semana1Fundamentos.encontrarMaior
import org.example.semana1Fundamentos.encontrarMenor
import org.example.semana1Fundamentos.filtrarPares
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class TestesSemana1 {
    @Test
    fun testCalcularSoma() {
        val numeros = listOf(3, 10, 7, 2, 8, 5, 1)
        assertEquals(36, calcularSoma(numeros))
    }

    @Test
    fun testFiltrarPares() {
        val numeros = listOf(3, 10, 7, 2, 8, 5, 1)
        assertEquals(listOf(10, 2, 8), filtrarPares(numeros))
    }

    @Test
    fun testCalcularMedia() {
        val numeros = listOf(3, 10, 7, 2, 8, 5, 1)
        assertEquals(5.142857142857143, calcularMedia(numeros))
    }

    @Test
    fun testEncontrarMaior() {
        val numeros = listOf(3, 10, 7, 2, 8, 5, 1)
        assertEquals(10, encontrarMaior(numeros))
    }

    @Test
    fun testEncontrarMenor() {
        val numeros = listOf(3, 10, 7, 2, 8, 5, 1)
        assertEquals(1, encontrarMenor(numeros))
    }
}
