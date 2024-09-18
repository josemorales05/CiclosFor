package CiclosFor;

public class For21 {

            public static void main(String[] args) {
            // Definir el array de enteros
            int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

            // Bucle for para recorrer solo las posiciones impares
            System.out.println("Elementos en posiciones impares:");
            for (int i = 1; i < numeros.length; i += 2) {
                System.out.println(numeros[i]);
            }
        }
    }

