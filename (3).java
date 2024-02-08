import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the sum of digits
        int sum = sumOfDigits(number);

        // Display the sum of digits
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
