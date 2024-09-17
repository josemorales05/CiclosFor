package CiclosFor;

public class For18 {

        public static void main(String[] args) {
            // Definir el array de strings
            String[] palabras = {"hola", "jose", "hola", "java"};

            // Bucle for para recorrer el array y convertir cada palabra a mayúsculas
            System.out.println("Palabras convertidas a mayúsculas:");
            for (int i = 0; i < palabras.length; i++) {
                palabras[i] = palabras[i].toUpperCase();  // Convertir cada palabra a mayúsculas
                System.out.println(palabras[i]);  // Imprimir la palabra en mayúsculas
            }
        }
    }

