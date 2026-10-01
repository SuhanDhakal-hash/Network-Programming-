import java.awt.Desktop;
import java.net.URI;

public class URLOPERCORSE {

    public static void main(String[] args) {

        try {
            URI url = new URI("https://www.google.com");

            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(url);
                System.out.println("URL opened successfully.");
            } else {
                System.out.println("Desktop is not supported.");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}