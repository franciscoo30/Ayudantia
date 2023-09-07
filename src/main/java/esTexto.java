public class esTexto {
    public static void main(String[] args) {
        System.out.println(verificarTexto("amar"));
    }
    public static boolean verificarTexto(String palabraIngresada) {
        for (int i = 0; i < palabraIngresada.length(); i++) {
            if (Character.isDigit(palabraIngresada.charAt(i)) || palabraIngresada.isBlank()) {
                return false;
            }
        }
        return true;
    }
}