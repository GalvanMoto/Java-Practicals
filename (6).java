import java.util.Arrays;
import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Input the array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Input the element to be inserted
        System.out.print("Enter the element to be inserted: ");
        int element = scanner.nextInt();

        // Input the position to insert the element
        System.out.print("Enter the position to insert the element: ");
        int position = scanner.nextInt();

        // Validate the position
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position. Please enter a valid position.");
        } else {
            // Create a new array with increased size
            int[] newArray = new int[size + 1];

            // Copy the elements from the original array to the new array
            for (int i = 0, j = 0; i < size + 1; i++) {
                if (i == position - 1) {
                    newArray[i] = element;  // Insert the element at the specified position
                } else {
                    newArray[i] = array[j];
                    j++;
                }
            }

            // Display the updated array
            System.out.println("Updated array after insertion: " + Arrays.toString(newArray));
        }

        scanner.close();
    }
}
