package Java8;

import java.util.function.BiFunction;

public class Driver4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> f = (Integer n1, Integer n2) ->
        {
            int result = n1 + n2;
            return result;
        };
        System.out.println(f.apply(10, 20));
    }
}
