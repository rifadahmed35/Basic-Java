import java.sql.Time;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.SimpleFormatter;

public class Current_time_demo {
    public static void main(String[] args){
        LocalTime time = LocalTime.now();
        System.out.println(time);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTime = time.format(formatter);
        System.out.println(currentTime);
    }
}
