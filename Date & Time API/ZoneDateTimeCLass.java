import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeCLass {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        // India Time
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current india time: "+indiaTime);

        // New_Yor Time
        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current New_York Time: "+newYorkTime);

        ZoneId zone = indiaTime.getZone();
        System.out.println(zone);

        ZonedDateTime zdt = ZonedDateTime.parse("2025-06-09T13:40:47.173277300+05:30[Asia/Kolkata]");
        System.out.println(zdt);

    }
}
