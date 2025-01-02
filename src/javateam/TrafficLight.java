package javateam;

public class TrafficLight
{
        enum Light {
            RED("Stop"),
            YELLOW("Caution"),
            GREEN("Go");
            private final String action;
            Light(String action) {
                this.action = action;
            }
            public String getAction() {
                return action;
            }
        }
        public static void main(String[] args) {
            for (Light light : Light.values()) {
                System.out.println(light + ": " + light.getAction());
            }
        }
    }


