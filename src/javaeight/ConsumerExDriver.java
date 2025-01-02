package javaeight;

import java.util.function.Consumer;

public class ConsumerExDriver {
    public static void main(String[] args) {
        Consumer<Integer> c=(Integer n1)->
        {
            if(n1%2==0)
            {
                System.out.println("The number is Even");
            }
            else {
                System.out.println("The number is Odd");
            }
        };
        c.accept(86);
    }
}
