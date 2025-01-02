package javaeight;

import java.util.function.BiFunction;

public class CalculatorImplwithLamda {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer>bi=CalcyImpl::add;
        int result=bi.apply(10,20);
        System.out.println(result);

    }
}
