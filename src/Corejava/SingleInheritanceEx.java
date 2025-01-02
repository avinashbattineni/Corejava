package Corejava;


class A
{
    public void m1()
    {
        System.out.println("This is parent class");
    }
}

public class SingleInheritanceEx extends A
{
    public static void main(String[] args)
    {
        SingleInheritanceEx s=new SingleInheritanceEx();
        s.m1();

    }
}
