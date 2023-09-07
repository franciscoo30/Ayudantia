import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PromedioNotasTest {

    @Test
    void calcularPromedioNotas() {
        double[] notas = {70, 40, 10, 45, 30};
        double [] ponderacionNotas = {0.35, 0.15, 0.10, 0.10, 0.30};


        double resultado = promedioNotas.calcularPromedioNotas(notas);


        double resultadoEsperado = 45.0;
        assertEquals(resultadoEsperado, resultado);
    }
}
