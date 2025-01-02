package javateam;

import java.time.LocalDate;

public class DateTime
{
    public static void main(String[] args) {
        LocalDate ld= LocalDate.now();
        System.out.println(ld);
        System.out.println("tomorrows date:"+ld.plusDays(1));
        System.out.println("yesterday date:"+ld.minusDays(1));
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        }
}
