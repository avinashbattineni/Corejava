package Java8;

public class BDriver {
    public static void main(String[] args) {
        B b = new BImpl()::add;
        int result = b.sum(10, 20);
        System.out.println(result);
    }

}
