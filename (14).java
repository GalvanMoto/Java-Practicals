import java.io.File;
import java.io.FilenameFilter;

public class FileListing {
    public static void main(String[] args) {
        // Specify the directory path
        String directoryPath = "."; // Current working directory

        // Specify the pattern to match
        String pattern = ".txt"; // Example: List .txt files

        // Create a FilenameFilter using a lambda expression
        FilenameFilter filter = (dir, name) -> name.endsWith(pattern);

        // Get the list of matching files
        File directory = new File(directoryPath);
        File[] files = directory.listFiles(filter);

        // Display the matching files
        if (files != null) {
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No files found matching the pattern.");
        }
    }
}
