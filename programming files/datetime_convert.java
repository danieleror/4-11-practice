import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {
    public static void main(String[] args) {
        // Set string to data and time
        String dateStr = "2022-03-17 10:45:30";
        //create DateTimeFormatter object
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // create LocalDate time object use formatter. 
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);
        // formate dateObj
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));
        // output date
        System.out.println(formattedDate);
    }
}
