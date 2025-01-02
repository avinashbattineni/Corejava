package Corejava;

class One
{
    public void method1()
    {
        System.out.println("This is method-1");
    }

}
class Two extends One
{
    public void method2()
    {
        System.out.println("This is method-2");
    }
}

public class MultilevelInheritanceEx  extends Two
{
    public static void main(String[] args)
    {
        MultilevelInheritanceEx m=new MultilevelInheritanceEx();
        m.method1();
        m.method2();
    }
}
