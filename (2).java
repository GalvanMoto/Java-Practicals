import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Reverse the string
        String reverse = reverseString(str);

        // Display the reverse string
        System.out.println("Reverse string: " + reverse);

        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
