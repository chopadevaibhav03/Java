import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DurationAndInstant {
    public static void main(String[] args) {
//        long currentTimeMillis = System.currentTimeMillis();
//        System.out.println(currentTimeMillis);
//
//        Instant now = Instant.now();
//        System.out.println(now);

        Instant start = Instant.now();
        int sum = 0;
        for (int i=0;i< 1000000;i++){
            sum += i+1;
        }
        Instant end = Instant.now();

        /*
        Duration is best  when we want to calculate difference...
        e.g Subscription..
         */
        Duration d1 = Duration.between(start,end);
        Duration d2 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(d1);
        System.out.println(d2);

        int  i = d2.compareTo(d1);
        System.out.println(i);

        int  i1 = d1.compareTo(d2);
        System.out.println(i);
    }
}
