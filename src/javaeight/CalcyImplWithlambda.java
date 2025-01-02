package javaeight;

import java.util.function.BiFunction;

public class CalcyImplWithlambda {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer>f=CalcyImpl :: add;
        int result=f.apply(20,30);
        System.out.println(result);
    }
}
