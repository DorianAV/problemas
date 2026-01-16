package com.training.arrays;

import java.util.Scanner;

public class ArrayStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Please enter 10 integers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("Results");
        System.out.println("1. Sum of all elements: " + sum);

        double average = (double) sum / numbers.length;
        System.out.println("2. Average: " + average);


        int primeCount = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                primeCount++;
            }
        }
        System.out.println("3. Count of prime numbers: " + primeCount);

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("4. Smallest number: " + min);
        System.out.println("4. Greatest number: " + max);
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}