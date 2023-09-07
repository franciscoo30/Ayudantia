public class Main {
    public static void main(String[] args) {
        String palindromo = "Arenera";
        double [] notas = {70, 40, 10, 45, 30};
        int [] puntajes = {2, 6};
        int [][] matriz = new int[5][5];

        llenarMatriz(matriz);
        System.out.println("---Matriz original---");
        mostrarMatriz(matriz);
        System.out.println("---Matriz traspuesta---");
        mostrarMatriz(trasponerMatriz(matriz));

        System.out.println(esTexto("arenera"));
        System.out.println(verificarPalindromo(palindromo));
        System.out.println(promedioNotas(notas));
        System.out.println(seleccionGanador(puntajes));

    }


    public static boolean verificarPalindromo(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", "");

        StringBuilder stringBuilder = new StringBuilder(palabraIngresada);
        String palabraInvertida = stringBuilder.reverse().toString();

        return palabraIngresada.equalsIgnoreCase(palabraInvertida);
    }

    public static double promedioNotas(double [] notas) {
        double [] ponderacionNotas = {0.25, 0.25, 0.25, 0.15, 0.10};
        double promedio = 0;

        for (int i = 0; i < notas.length; i++) {
            promedio += (notas[i] * ponderacionNotas[i]);  //error
        }

        return promedio;
    }

    private static String seleccionGanador(int [] puntajes) {
        int jugador1 = 20 - puntajes[0];
        int jugador2 = 20 - puntajes[1];
        if((jugador1 < 0 && jugador2 < 0) || jugador1 == jugador2) {
            return "Empate.";
        } else if((jugador1 < 0 || jugador2 < jugador1) && jugador2 >= 0) {
            return "Jugador 2 ganó.";
        } else {
            return "Jugador 1 ganó.";
        }
    }
    public static int[][] llenarMatriz(int[][] matriz){
        for(int x = 0; x < matriz.length; x++){
            for(int y = 0; y < matriz[0].length; y++){
                matriz[x][y] = (int) ((Math.random() * 10) + 1);
            }
        }
        return matriz;
    }
    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] trasponerMatriz(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }

    public static boolean esTexto(String palabraIngresada) {
        for (int i = 0; i < palabraIngresada.length(); i++) {
            if (Character.isDigit(palabraIngresada.charAt(i)) || palabraIngresada.isBlank()) {
                return false;
            }
        }
        return true;
    }

}
