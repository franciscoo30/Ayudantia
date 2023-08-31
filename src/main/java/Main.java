public class Main {
    public static void main(String [] args){
        int [][] matrizTiempo = crearMatriz();
        llenarMatriz(matrizTiempo);
    }
    public static int [][] crearMatriz(){
        int matriz [][] = new int[7][24];
    return matriz;}

    public static int [][] llenarMatriz(int [][] matriz){
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                matriz[x][y] = (int) (Math.random()*9+1);
            }
        }
    System.out.println(matriz);
    return matriz;}
}
