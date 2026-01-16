import java.util.Scanner;

public class ReverseOrderDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Array Size = ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            System.out.print("Element of a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nDisplay Reverse Order");
        for(int i=size-1; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }
}