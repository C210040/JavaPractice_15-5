import java.time.*;
import java.time.format.DateTimeFormatter;
import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate future = now.plusDays(100);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年mm月dd日");
        System.out.println(future.format(fmt));
    }
}