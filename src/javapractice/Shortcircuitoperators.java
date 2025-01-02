package javapractice;

public class Shortcircuitoperators//(&&, ||)
{
    public static void main(String []args)
    {
        int a=10;
        int b=10;
        if (a++==10 | b++==10)
        {
            System.out.println(a+ " "+b);
        }
        int c=10;
        int d=10;
        if (c++==10 || d++==10)
        {
            System.out.println(c+ " "+d);
        }

        int e=10;
        int f=10;
        if (e++!=10 & f++!=10)
        {

        }
        System.out.println(e+ " "+f);

        int g=10;
        int h=10;
        if (g++!=10 && h++!=10)
        {

        }
        System.out.println(g+ " "+h);

    }
}
