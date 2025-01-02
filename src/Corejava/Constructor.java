package Corejava;

public class Constructor
{
    static int a=10;
    public  Constructor()
    {
        System.out.println("This is constructor");
    }
    public void m1()
    {
        System.out.println("This is method");
    }

    public static void main(String[] args)
    {
        Constructor c=new Constructor();
        c.m1();
        System.out.println(a);

    }
}
