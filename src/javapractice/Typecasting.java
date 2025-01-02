package javapractice;

public class Typecasting
{
    public static void main(String[]args)
    {
        //implicit typecasting
        long a=30;
        float b=a;
        System.out.println(b);
        //explict typecasting
        double d=10;
        int  i=(short)d;
        System.out.println(i);

      double de=100.55;
      byte h=(byte)(short)(char)(int)(float)de;
      System.out.println(h);




    }
}
