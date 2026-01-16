import java.util.Scanner;

public class CheckDuplicateInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }

        boolean isDuplicate = false;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
        }

        if (isDuplicate) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}