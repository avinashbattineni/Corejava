package javaeight;

public class CalculatorDriver {
    public static void main(String[] args) throws InterruptedException {
        Calculator c = new CalculatorImpl()::add;
        int result = c.sum(20, 40);
        System.out.println(result);
    }
}

