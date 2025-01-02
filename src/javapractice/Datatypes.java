package javapractice;

public class Datatypes
{
    public static void main(String [] args)
    {
        //range (-2^n-1 to 2^n-1 -1) where n is number of bits
        byte by=1;
        short sh=2;
        int in=3;
        long lo=4;
        float fl=1.12f;
        double dou=12.22;
        char ch='a';
        String str="abc";
    System.out.println(by+ " "+ sh+ " "+ in+ " "+ lo+ " "+ fl+ " "+ dou+ " "+ ch+ " "+ str);
    System.out.println("byte"+ Byte.MIN_VALUE+ " to "+ Byte.MAX_VALUE);
    System.out.println("short"+ Short.MIN_VALUE+ " to "+ Short.MAX_VALUE);
    System.out.println("int"+ Integer.MIN_VALUE+ " to "+ Integer.MAX_VALUE);
        System.out.println("long"+ Long.MIN_VALUE+ " to "+ Long.MAX_VALUE);
        System.out.println("float"+ Float.MIN_VALUE+ " to "+ Float.MAX_VALUE);
        System.out.println("double"+ Double.MIN_VALUE+ " to "+ Double.MAX_VALUE);
        System.out.println("char"+ Character.MIN_VALUE+ " to "+ Character.MAX_VALUE);


    }
}
