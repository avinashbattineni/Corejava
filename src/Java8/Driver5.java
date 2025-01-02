package Java8;

import java.util.function.Consumer;

public class Driver5 {
    public static void main(String[] args) {
        Consumer<Integer>c=(Integer n1)->
        {
            if(n1%2==0)
            {
                System.out.println("even number");
            }
            else {
                System.out.println("odd number");
            }
        };
        c.accept(26);
    }
}
