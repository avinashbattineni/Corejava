package javapractice;

public class Booleanoperators
{
    public static void main(String []args)
    {
        //logical(&,|,^)

        boolean b1=true;
        boolean b2=false;
        System.out.println("b1&b1: "+(b1&b1));// T  T  T
        System.out.println("b1&b2: "+(b1&b2));// T  F F
        System.out.println("b2&b1: "+(b2&b1));// F T F
        System.out.println("b2&b2: "+(b2&b2));// F F F


        System.out.println("b1|b1: "+(b1|b1));// T T T
        System.out.println("b1|b2: "+(b1|b2));// T F T
        System.out.println("b2|b1: "+(b2|b1));// F T T
        System.out.println("b2|b2: "+(b2|b2));// F F F


        System.out.println("b1^b1: "+(b1^b1));//T T F
        System.out.println("b1^b2: "+(b1^b2));//T F T
        System.out.println("b2^b1: "+(b2^b1));//F T T
        System.out.println("b2^b2: "+(b2^b2));//F F F

        }
}
