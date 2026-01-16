import java.util.Scanner;

public class CheckValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter value to check:");
        int searchVal = scanner.nextInt();
        boolean found = false;

        for (int num : numbers) {
            if (num == searchVal) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The value is present.");
        } else {
            System.out.println("The value is not present.");
        }
    }
}