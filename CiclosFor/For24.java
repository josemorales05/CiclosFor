package CiclosFor;

public class For24 {

        public static void main(String[] args) {
            // Definir el array de strings
            String[] palabras = {"Hola", "Jose", "Como", "estas", "genial"};

            // Variable para almacenar el resultado concatenado
            StringBuilder resultado = new StringBuilder();

            // Bucle for para recorrer el array y concatenar los elementos
            for (int i = 0; i < palabras.length; i++) {
                resultado.append(palabras[i]);  // Agregar cada palabra
                if (i < palabras.length - 1) {
                    resultado.append(", ");  // Agregar coma y espacio después de cada palabra, excepto la última
                }
            }

            // Imprimir el string resultante
            System.out.println("Resultado concatenado: " + resultado.toString());
        }
    }

