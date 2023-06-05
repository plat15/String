import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bai4 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); 
        String formattedDateTime = now.format(formatter); 

        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
