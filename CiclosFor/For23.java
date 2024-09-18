package CiclosFor;

public class For23 {

        public static void main(String[] args) {
            // Definir un array de tipo Object que contiene diferentes tipos de datos
            Object[] elementos = {50, "Chao", 3.25, "Java", true, "Intellij", 62};

            // Inicializar el contador de strings
            int contadorStrings = 0;

            // Bucle for para recorrer el array y verificar si el elemento es de tipo String
            for (int i = 0; i < elementos.length; i++) {
                if (elementos[i] instanceof String) {
                    contadorStrings++;  // Incrementar el contador si el elemento es un String
                }
            }

            // Imprimir el número de elementos que son de tipo String
            System.out.println("Número de elementos de tipo String en el array: " + contadorStrings);
        }
    }

