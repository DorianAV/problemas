import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total range count (N): ");
        int n = scanner.nextInt();
        int[] arr = new int[n-1];

        System.out.println("Enter " + (n-1) + " numbers:");
        int actualSum = 0;
        for(int i=0; i<n-1; i++) {
            arr[i] = scanner.nextInt();
            actualSum += arr[i];
        }

        int expectedSum = n * (n + 1) / 2;
        int missing = expectedSum - actualSum;

        System.out.println("The missing number is: " + missing);
    }
}