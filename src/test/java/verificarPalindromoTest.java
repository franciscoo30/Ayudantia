import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class verificarPalindromoTest {

    @Test
    void testNoEsPalindromo() {
        assertFalse(verificarPalindromo.esPalindromo("transporte"));
    }

    @Test
    void testEsPalindromo() {
        assertTrue(verificarPalindromo.esPalindromo("arenera"));
    }

    @Test
    void testPalindromoEspaciado() {
        assertTrue(verificarPalindromo.esPalindromo("amar da drama"));
    }
}