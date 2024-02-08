public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 1000:");

        // Check each number from 1 to 1000
        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            // Check if the number is divisible by any number from 2 to its square root
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, display it
            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
