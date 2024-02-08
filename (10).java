import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class Windows95AppLauncher {
    public static void main(String[] args) {
        try {
            // Launch Notepad
            openApplication("notepad.exe");

            // Launch Calculator
            openApplication("calc.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void openApplication(String applicationPath) throws IOException {
        File file = new File(applicationPath);
        if (file.exists()) {
            Desktop.getDesktop().open(file);
        } else {
            System.out.println("Application not found: " + applicationPath);
        }
    }
}
