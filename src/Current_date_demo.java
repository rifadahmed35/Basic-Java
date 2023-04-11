import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Current_date_demo {
    public static void main(String[] args){
        Date date = new Date();
        System.out.println("Current date: "+date);

        //Formation of date.

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("Formation of Current date: "+currentDate);

    }
}
