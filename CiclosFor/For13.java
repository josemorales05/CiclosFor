package CiclosFor;

public class For13 {

    public static void main(String[] args) {
        // Definir el array de enteros
        int[] numeros = {2, 16, 5, 12, 80, 1, 54, 20, 15, 4, 10};

        // Inicializar el contador
        int contador = 0;

        // Bucle for para recorrer el array
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 10) {
                contador++;  // Incrementar el contador si el número es mayor que 10
            }
        }

        // Mostrar el resultado
        System.out.println("Cantidad de números mayores que 10: " + contador);
    }
}

