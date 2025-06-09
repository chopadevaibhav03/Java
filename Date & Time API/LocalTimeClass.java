import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime customTime = LocalTime.of(14,30);
        System.out.println(customTime);

        LocalTime parseTime = LocalTime.parse("15:10:20");
        System.out.println(parseTime);
        LocalTime beforeHour = now.minusHours(1);
        System.out.println(beforeHour);
        if (now.isAfter(beforeHour)){
            System.out.println("Ji bhai jaan " );
        }
        System.out.println(LocalTime.now());



    }
}
