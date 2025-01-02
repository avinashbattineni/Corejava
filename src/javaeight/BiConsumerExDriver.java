package javaeight;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerExDriver {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> bi = (Integer n1, Integer n2) ->
        {
            System.out.println(n1+n2);
        };
        bi.accept(1045,452);
    }
}
