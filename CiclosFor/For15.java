package CiclosFor;

public class For15 {

        public static void main(String[] args) {
            // Definir el array de enteros
            int[] numeros = {30, 50, 70, 80, 90};

            // Bucle for para recorrer el array en orden inverso
            System.out.println("Elementos del array en orden inverso:");
            for (int i = numeros.length - 1; i >= 0; i--) {
                System.out.println(numeros[i]);
            }
        }
    }

