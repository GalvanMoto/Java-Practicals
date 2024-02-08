import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the source file name
        System.out.print("Enter the source file name: ");
        String sourceFileName = scanner.nextLine();

        // Input the target file name
        System.out.print("Enter the target file name: ");
        String targetFileName = scanner.nextLine();

        // Create file objects for source and target files
        File sourceFile = new File(sourceFileName);
        File targetFile = new File(targetFileName);

        try {
            // Check if the target file exists
            if (targetFile.exists()) {
                System.out.print("Target file already exists. Do you want to overwrite it? (y/n): ");
                String overwriteChoice = scanner.nextLine();

                if (overwriteChoice.equalsIgnoreCase("y")) {
                    // Overwrite the target file
                    Files.copy(sourceFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("File copied successfully!");
                } else {
                    System.out.println("File copy operation cancelled.");
                }
            } else {
                // Copy the file to the target location
                Files.copy(sourceFile.toPath(), targetFile.toPath());
                System.out.println("File copied successfully!");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file: " + e.getMessage());
        }

        scanner.close();
    }
}
