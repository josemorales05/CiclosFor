package CiclosFor;

public class For16 {

        public static void main(String[] args) {
            // Inicializar los primeros dos números de la secuencia
            int num1 = 0, num2 = 1;

            // Definir cuántos números de Fibonacci imprimir
            int totalNumeros = 10;

            System.out.println("Primeros " + totalNumeros + " números de Fibonacci:");

            // Imprimir los primeros 10 números de Fibonacci
            for (int i = 1; i <= totalNumeros; i++) {
                System.out.print(num1 + " ");  // Imprimir el número actual

                // Calcular el siguiente número en la secuencia
                int siguiente = num1 + num2;
                num1 = num2;  // Actualizar num1
                num2 = siguiente;  // Actualizar num2
            }
        }
    }

