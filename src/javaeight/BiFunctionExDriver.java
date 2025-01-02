package javaeight;

import java.util.function.BiFunction;

public class BiFunctionExDriver {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bi = (Integer n1, Integer n2) ->
        {
            return n1 + n2;
        };
        int result = bi.apply(10, 20);
        System.out.println(result);
    }
}
