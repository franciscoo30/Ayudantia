public class promedioNotas {
    public static void main(String[] args) {
        double [] notas = {70, 40, 10, 45, 30};
        System.out.println(calcularPromedioNotas(notas));
    }

    public static double calcularPromedioNotas(double [] notas) {
        double [] ponderacionNotas = {0.35, 0.15, 0.10, 0.10, 0.30};
        double promedio = 0;

        for (int i = 0; i < notas.length; i++) {
            promedio += (notas[i] * ponderacionNotas[i]);
        }

        return promedio;
    }
}
