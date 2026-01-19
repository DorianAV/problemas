package trainee.problems;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total range count (n): ");
        int n = scanner.nextInt();
        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");
        
        int actualSum = 0;
        int smallest = Integer.MAX_VALUE; // Para encontrar el inicio de la secuencia

        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
            actualSum += arr[i];
            
            // Buscamos el número menor para saber dónde empieza la secuencia
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Si el número faltante es justo el primero de la secuencia, 
        // este método asume que el menor ingresado es el inicio real.
        // Fórmula: Suma = (cantidad de números / 2) * (primero + último)
        int lastNumber = smallest + n - 1;
        int expectedSum = (n * (smallest + lastNumber)) / 2;
        
        int missing = expectedSum - actualSum;

        // Caso especial: Si la suma actual y esperada son iguales, 
        // podría significar que el número que falta es el 'smallest - 1'
        if (missing == 0) {
            System.out.println("No missing number in the middle. It could be " + (smallest - 1));
        } else {
            System.out.println("The missing number is: " + missing);
        }
        
        scanner.close();
    }
}
