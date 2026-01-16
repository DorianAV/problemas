import java.util.Scanner;

public class StringArrayDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        String[] words = new String[n];

        System.out.println("Enter strings:");
        for(int i=0; i<n; i++) {
            words[i] = scanner.next();
        }

        boolean found = false;
        for(int i=0; i<words.length; i++) {
            for(int j=i+1; j<words.length; j++) {
                if(words[i].equals(words[j])) {
                    System.out.println("Duplicate found: " + words[i]);
                    found = true;
                }
            }
        }

        if(!found) {
            System.out.println("No duplicates found.");
        }
    }
}