package javaeight;

import java.util.function.Predicate;

public class PredicateExDriver {
    public static void main(String[] args) {
        Predicate<Integer>p=(Integer n1)->
        {
            if(n1%2==0)
            {
                return true;
            }
            else {
                return false;
            }
        };
        boolean flag=p.test(100);
        if(flag)
        {
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
