package CiclosFor;

public class For19 {

        public static void main(String[] args) {
            // Definir el número de niveles de la pirámide
            int niveles = 5;

            // Bucle for para crear la pirámide
            for (int i = 1; i <= niveles; i++) {
                // Bucle interno para imprimir los asteriscos en cada fila
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");  // Imprimir asterisco sin salto de línea
                }
                System.out.println();  // Saltar a la siguiente línea después de cada fila
            }
        }
    }

