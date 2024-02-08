import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the file name
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int lineCount = 0;
            int wordCount = 0;
            String line;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                lineCount++;

                // Count words in the line
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }

            // Display the results
            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        scanner.close();
    }
}
