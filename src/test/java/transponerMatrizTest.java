import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class transponerMatrizTest {

    @Test
    void llenarMatriz() {
        int[][] matriz = new int[3][3];
        transponerMatriz.llenarMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                assertTrue(matriz[i][j] >= 1 && matriz[i][j] <= 10);
            }
        }
    }
}
