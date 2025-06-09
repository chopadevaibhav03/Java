import java.time.LocalDate;
import java.time.Period;

public class PerisodClass {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate then  = LocalDate.of(2001,10,15);
        Period period = Period.between(now,then);
        System.out.println(period);


    }
}
