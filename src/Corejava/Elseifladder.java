package Corejava;

public class Elseifladder
{
    public static void main(String[] args)
    {
        int a=10;
        int b=10;
        int c=10;
        if(a>b & a>c)
        {
            System.out.println("a is bigger ");
        }
        else if(b>c & b>a)
        {
            System.out.println("b is bigger");
        }
        else if (c>a & c>b)
        {
            System.out.println("C is bigger");
        }
        else
        {
            System.out.println("all are equal");
        }

    }
}
