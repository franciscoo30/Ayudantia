import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class esTextoTest {
    @Test
    void testTextoTrue() {
        assertTrue(esTexto.verificarTexto("amar"));
    }

    @Test
    void testTextoEspaciado() {
        assertTrue(esTexto.verificarTexto("hola mundo"));
    }

    @Test
    void testTextoSinNada() {
        assertFalse(esTexto.verificarTexto(" "));
    }
}
