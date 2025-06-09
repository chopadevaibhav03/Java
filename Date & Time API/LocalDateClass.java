import java.time.LocalDate;

public class LocalDateClass {
    public static void main(String[] args) {
        // TO get todays date
        LocalDate now = LocalDate.now();
        System.out.println("Default date: "+now);

        // Custom Date
        LocalDate of = LocalDate.of(2001,10,15);
        System.out.println("Custom Date: "+of);

        // DayOfMonth
        int dayOfMonth = now.getDayOfMonth();
        System.out.println("Date: "+dayOfMonth);

        // Date
        int currentDate = now.getMonthValue();
        System.out.println("Month: "+currentDate);

        // Year 
        int year = now.getYear();
        System.out.println("Running year: "+year);

        // previous date
        LocalDate yesterday = now.minusDays(1);
        System.out.println("yesterday date:  "+yesterday);

        // previous month
        LocalDate pmonth = now.minusMonths(1);
        System.out.println("Previous month date: "+pmonth);

        LocalDate today = LocalDate.now();
        if(today.isAfter(yesterday)){
            System.out.println("Sunday! ");
        }



    }
}
