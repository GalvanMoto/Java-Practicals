public class MathFunctionsDemo {
    public static void main(String[] args) {
        // Absolute value
        int absoluteValue = Math.abs(-10);
        System.out.println("Absolute value: " + absoluteValue);

        // Maximum and minimum
        int max = Math.max(5, 8);
        int min = Math.min(5, 8);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Rounding
        double roundedValue = Math.round(3.75);
        System.out.println("Rounded value: " + roundedValue);

        // Square root and power
        double sqrt = Math.sqrt(16);
        double power = Math.pow(2, 3);
        System.out.println("Square root: " + sqrt);
        System.out.println("Power: " + power);

        // Trigonometric functions
        double sine = Math.sin(Math.PI / 2);
        double cosine = Math.cos(Math.PI);
        double tangent = Math.tan(Math.PI / 4);
        System.out.println("Sine: " + sine);
        System.out.println("Cosine: " + cosine);
        System.out.println("Tangent: " + tangent);

        // Logarithm and exponential
        double logarithm = Math.log(10);
        double exponential = Math.exp(2);
        System.out.println("Logarithm: " + logarithm);
        System.out.println("Exponential: " + exponential);

        // Random number
        double random = Math.random();
        System.out.println("Random number: " + random);
    }
}
