package Corejava;

public class Variables
{
   public  int instance1=20;
   public  int instance2=40;
   public  int instance3=50;
   public static int static1=60;

    public  Variables()
    {
        System.out.println("This is constructor");
    }
    public void m1()
    {
        int local1=10;
        System.out.println("This is local1 "+local1);
        System.out.println("This is instance1 "+instance1);
        System.out.println(static1);
    }
    public void m2()
    {
        int local2=30;
        System.out.println("This is local2 "+local2);
        System.out.println("this is instance2 "+instance2);
    }

    public static void main(String [] args)
        {
            Variables v= new Variables();
            v.m1();
            v.m2();
            System.out.println(v.instance3);
            System.out.println("This is static variable"+static1);
        }

}