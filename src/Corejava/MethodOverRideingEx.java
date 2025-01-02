package Corejava;
class Child
{
    public void add(int a,int b)
    {
        System.out.println(a*b);
    }
}

public class MethodOverRideingEx extends Child
{
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args)
    {
         Child c=new Child();
         c.add(2,5);

        MethodOverRideingEx m=new MethodOverRideingEx();
        m.add(2,5);
    }
}
