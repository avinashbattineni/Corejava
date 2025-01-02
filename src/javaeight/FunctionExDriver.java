package javaeight;

import java.util.function.Function;

public class FunctionExDriver {
    public static void main(String[] args) {
        Function<Integer,String> f=(Integer n1)->
        {
            if(n1%2==0)
            {
                return "Even Number";
            }
            else {
                return "Odd Number";
            }
        };
        String result=f.apply(20);
        System.out.println(result);
    }
}
