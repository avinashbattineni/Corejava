package Java8;

import java.util.function.Predicate;

public class Driver7 {
    public static void main(String[] args) {
        Predicate<Integer> p = (Integer n1) ->
        {
            if(n1%2==0)
            {
                return true;
            }
            else {
                return false;
            }
        };
        boolean flag=p.test(12);
        if(flag)
        {
            System.out.println("even");
        }
        else {
            System.out.println("false");
        }
    }
}
