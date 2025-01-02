package javateam;

public class DaysOfWeek
{
        enum Day {
            MONDAY("Weekday"),
            TUESDAY("Weekday"),
            WEDNESDAY("Weekday"),
            THURSDAY("Weekday"),
            FRIDAY("Weekday"),
            SATURDAY("Weekend"),
            SUNDAY("Weekend");
            private final String type;
            Day(String type) {
                this.type = type;
            }
            public String getType() {
                return type;
            }
        }
        public static void main(String[] args) {
            for (Day day : Day.values()) {
                System.out.println(day + ": " + day.getType());
            }
        }
    }


