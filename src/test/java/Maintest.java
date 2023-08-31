import java.util.Scanner;
public class Maintest {
    public static void main(String [] args){
        int [][] matrizTiempo = crearMatriz();
        llenarMatriz(matrizTiempo);
        imprimirMatriz(matrizTiempo);
        menu();
    }

    public static int [][] crearMatriz(){
        int matriz[][] = new int [7][24];
        return matriz;
    }
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int [][] llenarMatriz(int[][] matriz){
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random()*9+1);
            }
        }
    return matriz;}
    public static void imprimirMenu(){
        System.out.println("---Menú---");
        System.out.println("1.- Mostrar el dia mas caluroso");
        System.out.println("2.- Mostrar el dia mas frio");
        System.out.println("3.- Mostrar hora y dia de la temperatura mas baja");
        System.out.println("4.- Mostrar hora y dia de la temperatura mas alta");
        System.out.println("5.- Mostrar promedio de la temperatura de la semana");
        System.out.println("6.- Salir");
    }
    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            imprimirMenu();

            int opcion = scanner.nextInt();

            if (opcion == 1){
                System.out.println("Mostrar el dia mas caluroso");

            } else if (opcion == 2){
                System.out.println("Mostrar el dia mas frio");

            } else if (opcion == 3){
                System.out.println("Mostrar hora y dia de la temperatura mas baja");

            } else if (opcion == 4){
                System.out.println("Mostrar hora y dia de la temperatura mas alta");
            } else if (opcion == 5){
                System.out.println("Mostrar promedio de la temperatura de la semana");
            } else if (opcion == 6){
                System.out.println("Salir");
                scanner.close();
                break;
            } else {
                System.out.println("Opción ingresada no es válida");
            }
        }
    }
    public static int [] sumarFilas(int[][] matriz) {
        int[] sumasPorFila = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            sumasPorFila[i] = sumaFila;
        }
        return sumasPorFila;
    }
}

