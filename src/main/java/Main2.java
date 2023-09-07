import java.util.Scanner;
public class Main2 {
    public static void main(String [] args){
        menu();
    }
    public static int [][] crearMatriz(){
        int matriz [][] = new int [7][24];
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
        int [][] matrizTiempo = crearMatriz();
        llenarMatriz(matrizTiempo);
        imprimirMatriz(matrizTiempo);
        while (true) {
            imprimirMenu();

            int opcion = scanner.nextInt();

            if (opcion == 1){
                mostrarDiaMasCaluroso(matrizTiempo);

            } else if (opcion == 2){
                mostrarDiaMenosCaluroso(matrizTiempo);

            } else if (opcion == 3){
                mostrarDiaHoraTemperaturaMasBaja(matrizTiempo);

            } else if (opcion == 4){
                mostrarDiaHoraTemperaturaMasAlta(matrizTiempo);

            } else if (opcion == 5){
                mostrarPromedioSemana(matrizTiempo);

            } else if (opcion == 6){
                scanner.close();
                break;

            } else {
                System.out.println("Opción ingresada no es válida");
            }
        }
    }
    public static double[] calcularPromedioPorDia(int[][] matriz) {
        double[] promedios = new double[matriz.length];

        for (int dia = 0; dia < matriz.length; dia++) {
            int sumaTemperaturas = 0;
            for (int hora = 0; hora < matriz[dia].length; hora++) {
                sumaTemperaturas += matriz[dia][hora];
            }
            promedios[dia] = (double) sumaTemperaturas / matriz[dia].length;
        }

        return promedios;
    }
    public static void mostrarDiaMasCaluroso(int[][] matriz) {
        double[] promedios = calcularPromedioPorDia(matriz);

        int diaMasCaluroso = 0;
        double temperaturaMaxima = promedios[0];

        for (int dia = 1; dia < promedios.length; dia++) {
            if (promedios[dia] > temperaturaMaxima) {
                temperaturaMaxima = promedios[dia];
                diaMasCaluroso = dia;
            }
        }

        System.out.println("El día más caluroso es el día " + (diaMasCaluroso + 1) + " con un promedio de temperatura de " + temperaturaMaxima + " grados.");
    }
    public static void mostrarDiaMenosCaluroso(int[][] matriz) {
        double[] promedios = calcularPromedioPorDia(matriz);

        int diaMenosCaluroso = 0;
        double temperaturaMinima = promedios[0];

        for (int dia = 1; dia < promedios.length; dia++) {
            if (promedios[dia] < temperaturaMinima) {
                temperaturaMinima = promedios[dia];
                diaMenosCaluroso = dia;
            }
        }

        System.out.println("El día menos caluroso es el día " + (diaMenosCaluroso + 1) + " con un promedio de temperatura de " + temperaturaMinima + " grados.");
    }
    public static int[] encontrarTemperaturaMasBaja(int[][] matriz) {
        int diaMasBajo = -1;
        int horaMasBaja = -1;
        int temperaturaMasBaja = matriz[0][0];  // Inicializamos con la primera temperatura de la matriz

        for (int dia = 0; dia < matriz.length; dia++) {
            for (int hora = 0; hora < matriz[dia].length; hora++) {
                int temperaturaActual = matriz[dia][hora];
                if (temperaturaActual < temperaturaMasBaja) {
                    temperaturaMasBaja = temperaturaActual;
                    diaMasBajo = dia;
                    horaMasBaja = hora;
                }
            }
        }

        return new int[]{diaMasBajo, horaMasBaja, temperaturaMasBaja};
    }
    public static void mostrarDiaHoraTemperaturaMasBaja(int[][] matriz) {
        int[] resultado = encontrarTemperaturaMasBaja(matriz);

        int diaMasBajo = resultado[0];
        int horaMasBaja = resultado[1];
        int temperaturaMasBaja = resultado[2];

        if (diaMasBajo != -1 && horaMasBaja != -1) {
            System.out.println("La temperatura más baja se registró el día " + (diaMasBajo + 1) +
                    " a las " + (horaMasBaja) + " horas, con " + temperaturaMasBaja + " grados.");
        } else {
            System.out.println("No se encontró información de temperaturas.");
        }
    }
    public static int[] encontrarTemperaturaMasAlta(int[][] matriz) {
        int diaMasAlto = -1;
        int horaMasAlta = -1;
        int temperaturaMasAlta = matriz[0][0];  // Inicializamos con la primera temperatura de la matriz

        for (int dia = 0; dia < matriz.length; dia++) {
            for (int hora = 0; hora < matriz[dia].length; hora++) {
                int temperaturaActual = matriz[dia][hora];
                if (temperaturaActual > temperaturaMasAlta) {
                    temperaturaMasAlta = temperaturaActual;
                    diaMasAlto = dia;
                    horaMasAlta = hora;
                }
            }
        }
        return new int[]{diaMasAlto, horaMasAlta, temperaturaMasAlta};
    }

    public static void mostrarDiaHoraTemperaturaMasAlta(int[][] matriz) {
        int[] resultado = encontrarTemperaturaMasAlta(matriz);

        int diaMasAlto = resultado[0];
        int horaMasAlta = resultado[1];
        int temperaturaMasAlta = resultado[2];

        if (diaMasAlto != -1 && horaMasAlta != -1) {
            System.out.println("La temperatura más alta se registró el día " + (diaMasAlto + 1) +
                    " a las " + horaMasAlta + " horas, con " + temperaturaMasAlta + " grados.");
        } else {
            System.out.println("No se encontró información de temperaturas.");
        }
    }
    public static double calcularPromedioSemana(int[][] matriz) {
        int sumaTotal = 0;
        int cantidadElementos = 0;

        for (int dia = 0; dia < matriz.length; dia++) {
            for (int hora = 0; hora < matriz[dia].length; hora++) {
                sumaTotal += matriz[dia][hora];
                cantidadElementos++;
            }
        }

        if (cantidadElementos > 0) {
            return (double) sumaTotal / cantidadElementos;
        } else {
            return 0.0; // Si no hay datos disponibles, el promedio es 0.0
        }
    }

    public static void mostrarPromedioSemana(int[][] matriz) {
        double promedioSemana = calcularPromedioSemana(matriz);

        System.out.println("El promedio de temperatura de la semana es: " + promedioSemana + " grados.");
    }
}
