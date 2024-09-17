package CiclosFor;

public class For17 {

        public static void main(String[] args) {
            // Definir la palabra
            String palabra = "Java";

            // Bucle for para recorrer la palabra
            System.out.println("Letras de la palabra '" + palabra + "':");
            for (int i = 0; i < palabra.length(); i++) {
                System.out.println(palabra.charAt(i));  // Imprimir cada letra
            }
        }
    }

