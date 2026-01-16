import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size for both arrays: ");
        int n = scanner.nextInt();

        String[] array1 = new String[n];
        String[] array2 = new String[n];

        System.out.println("Enter elements for Array 1:");
        for(int i=0; i<n; i++) array1[i] = scanner.next();

        System.out.println("Enter elements for Array 2:");
        for(int i=0; i<n; i++) array2[i] = scanner.next();

        System.out.println("Common elements:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}