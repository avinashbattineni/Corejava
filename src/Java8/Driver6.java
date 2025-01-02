package Java8;

import java.util.function.BiConsumer;

public class Driver6 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> b = (Integer n1, Integer n2) ->
        {
            System.out.println(n1 + n2);
        };
        b.accept(10,36);
    }
}
