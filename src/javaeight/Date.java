package javaeight;

import java.time.LocalDate;

public class Date {
    public static void main(String[] args) {
        LocalDate l = LocalDate.now();
        System.out.println(l);
        System.out.println(l.plusDays(2));
        System.out.println(l.minusDays(2));
        System.out.println(l.getYear());
        System.out.println(l.getMonth());
        System.out.println(l.getMonthValue());
        System.out.println(l.getDayOfMonth());
        System.out.println(l.atStartOfDay());

    }
}
