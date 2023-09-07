public class transponerMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[6][6];
        llenarMatriz(matriz);
        System.out.println("---Matriz original---");
        mostrarMatriz(matriz);
        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matriz);
        System.out.println("---Matriz transpuesta---");
        mostrarMatriz(matrizTranspuesta);
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[0].length; y++) {
                matriz[x][y] = (int) ((Math.random() * 10) + 1);
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] obtenerMatrizTranspuesta(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }
}
