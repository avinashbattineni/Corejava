package Corejava;
import java.util.ArrayList;

public class ArrList2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> x=new ArrayList<Integer>(2);
          int y=20;
          x.add(10);
          x.add(y);
          x.add(30);
          x.add(40);
          x.add(50);
        System.out.println(x);
        x.set(0,200000);
        System.out.println(x);
    }
}
