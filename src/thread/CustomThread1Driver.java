package thread;

public class CustomThread1Driver {
    public static void main(String[] args) {
        CustomThread1 c = new CustomThread1();
        Thread t = new Thread(c);
        t.start();
    }
}
