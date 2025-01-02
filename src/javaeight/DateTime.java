package javaeight;

import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime l= LocalDateTime.now();
        System.out.println(l);
        System.out.println(l.getDayOfMonth());
        System.out.println(l.getDayOfWeek());
        System.out.println(l.getDayOfYear());
        System.out.println(l.getHour());
    }
}
