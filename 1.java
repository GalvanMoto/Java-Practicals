import java.util.Scanner;

public class StringEqualityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Input the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the strings are equal
        boolean isEqual = str1.equals(str2);

        // Display the result
        if (isEqual) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        scanner.close();
    }
}
