package Java8;

import java.util.function.BiPredicate;

public class Driver8 {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> b = (Integer n1, Integer n2) ->
        {
              if((n1+n2)%2==0)
              {
                  return true;
              }
              else {
                  return false;
              }
        };
       boolean flag= b.test(10,26);
        if(flag)
        {
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
}
