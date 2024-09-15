package CiclosFor;

public class ForNumeroGrandeArray {
    public static void main(String[] args) {


        int[] numbers = {10, 20, 35, 40, 15, 60, 25, 80, 90, 5};


        int max = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }


        System.out.println("El número más grande en el array es: " + max);
    }
}
