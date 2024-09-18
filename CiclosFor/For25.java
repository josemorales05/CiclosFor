package CiclosFor;

public class For25 {

        public static void main(String[] args) {
            // Definir el número de filas para la pirámide invertida
            int filas = 5;

            // Bucle for para crear la pirámide invertida
            for (int i = filas; i > 0; i--) {
                // Bucle interno para imprimir los asteriscos en cada fila
                for (int j = 0; j < i; j++) {
                    System.out.print("*");  // Imprimir asterisco sin salto de línea
                }
                System.out.println();  // Saltar a la siguiente línea después de imprimir los asteriscos
            }
        }
    }

