package Corejava;

import java.sql.SQLOutput;

public class Demo2
{
    public void m1()
    {
        String str1="abcd";
        System.out.println("This is method-1");

    }
    public void m2()
    {
        System.out.println("This is method-2");
    }

    public static void main(String[] args)
    {
      Demo2 d=new Demo2();
      d.m1();
      d.m2();
    }
}
