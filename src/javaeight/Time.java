package javaeight;

import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
        LocalTime l= LocalTime.now();
        System.out.println(l);
        System.out.println(l.getHour());
        System.out.println(l.getMinute());
        System.out.println(l.getSecond());
        System.out.println(l.getNano());
        System.out.println();
    }
}
