package Corejava;

public class MethodOverloadingEx2
{
    public void add(int a, int b)
    {
        System.out.println("sum is: "+(a+b));
    }
    public void add(float a, float b)
    {
        System.out.println("sum is: "+(a+b));
    }

    public static void main(String[] args)
    {
        MethodOverloadingEx2 m=new MethodOverloadingEx2();
        m.add(2,3);
        m.add(2.55f, 3.55f);
    }
}
