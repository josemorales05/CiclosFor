package CiclosFor;
import java.util.Scanner;

public class For20 {

        public static void main(String[] args) {
            // Definir el array de enteros
            int[] numeros = {32, 4, 10, 29, 1, 14, 86};

            // Crear un Scanner para obtener la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario que ingrese el número a buscar
            System.out.print("Introduce un número para buscar en el array: ");
            int numeroBuscado = scanner.nextInt();

            // Variable para indicar si se encontró el número
            boolean encontrado = false;

            // Bucle for para recorrer el array y verificar si el número está presente
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == numeroBuscado) {
                    encontrado = true;  // Marcar como encontrado si se encuentra el número
                    break;  // Salir del bucle una vez encontrado
                }
            }

            // Imprimir el resultado
            if (encontrado) {
                System.out.println("Numero encontrado en el Array");
            } else {
                System.out.println("Numero No encontrado en el Array");
            }
        }
    }

