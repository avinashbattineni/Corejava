package Corejava;

public class static_variable
{
    static int a=10; //static variable
    static int b=20; //static variable
    public void m1()
    {
        System.out.println("This is method-1");
        System.out.println(a);
        System.out.println(Variables.static1);
    }

    public static void main(String[] args)
    {
        System.out.println(a+b);
        static_variable s=new static_variable();
        s.m1();

    }
}
