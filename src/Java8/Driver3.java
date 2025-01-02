package Java8;

import java.util.function.Function;

public class Driver3 {
    public static void main(String[] args)
    {
        Function <Integer,String>f=(Integer n1)->
        {
          if(n1%2==0)
          {
              return "even number";
          }
          else {
              return "odd number";
          }
        };
        System.out.println(f.apply(16));


    }
}
