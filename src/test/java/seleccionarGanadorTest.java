import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class seleccionarGanadorTest {

    @Test
    void testGanadorJugador1Gana() {
        int[] puntajes = {20, 15};
        String resultado = seleccionarGanador.ganador(puntajes);
        assertEquals("Jugador 1 ganó.", resultado);
    }

    @Test
    void testGanadorJugador2Gana() {
        int[] puntajes = {2, 19};
        String resultado = seleccionarGanador.ganador(puntajes);
        assertEquals("Jugador 2 ganó.", resultado);
    }
}
