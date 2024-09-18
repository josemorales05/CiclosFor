package CiclosFor;

public class For22 {

        public static void main(String[] args) {
            // Definir el array de números
            int[] numeros = {20, 30, 40, 50, 60};

            // Inicializar la suma
            int suma = 0;

            // Bucle for para sumar todos los elementos del array
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];  // Sumar cada elemento al total
            }

            // Calcular el promedio
            double promedio = (double) suma / numeros.length;

            // Imprimir el resultado
            System.out.println("El promedio de los números es: " + promedio);
        }
    }

