package testesSemana1

import org.example.calcularSoma
import org.example.filtrarPares
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
}
