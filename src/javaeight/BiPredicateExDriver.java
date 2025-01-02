package javaeight;

import java.util.function.BiPredicate;

public class BiPredicateExDriver {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer>i=(Integer n1,Integer n2)->
        {
            if((n1+n2)%2==0)
            {
                return true;
            }
            else {
                return false;
            }
        };
        boolean flag=i.test(10,26);
        if(flag)
        {
            System.out.println("Even number");
        }
        else {
            System.out.println("odd Number");
        }
    }
}
