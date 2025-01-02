package javapractice;

public class Numbersystem
{
    public static void main(String[] args)
    {
        //binary number system (0,1)it is prefixed with 0b/0B(it is alowed from java 7 version)
        int a=0b1010;
        int b=0B100;
        System.out.println(a);
        System.out.println(b);
        //octal number system(0,1,2,3,4,5,6,7) it is prefixed with 0.
        int c=01010;
        int d=0107;
        System.out.println(c);
        System.out.println(d);
        //decimal(1,2,3,4,5,6,7,8,9)
        int e=100;
        System.out.println(e);
        // hexadecimal system(0-9,a,b,c,d,e,f) prefixed with 0x/0X.
        int f=0x1f;
        int g=0X10;
        System.out.println(f+ "\n"+ g);
    }
}
