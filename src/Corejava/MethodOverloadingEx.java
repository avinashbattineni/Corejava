package Corejava;

public class MethodOverloadingEx
{
    public void add(int a, int b)
    {
        System.out.println("sum of two numbers is: "+ (a+b));
    }
    public void add(int a, int b, int c)
    {
        System.out.println("sum of three numbers is: "+ (a+b+c));
    }

    public static void main(String[] args)
    {
        MethodOverloadingEx m=new MethodOverloadingEx();
        m.add(5,10);
        m.add(5,10,15);

    }
}
