package Corejava;
import java.util.ArrayList;

public class ArrList
{
    public static void main(String[] args)
    {
        ArrayList<String>x=new ArrayList<String>(4);
         x.add("apple");
         x.add("mango");
         x.add("grapes");
         x.add("strawberry");
        System.out.println(x);
        System.out.println(x.get(2));
        x.set(1,"watermelon");
        System.out.println(x);
    }
}
