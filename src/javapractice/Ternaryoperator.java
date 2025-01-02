package javapractice;

public class Ternaryoperator
{
    public static void main(String[] args)
    {    //ternay operator(exp1?exp2:exp3)
        int a=10;
        int b=20;
        int minimum=(a<b)?a:b;
        int maximum=(a>b)?a:b;
        System.out.println("small number"+ minimum);
        System.out.println("big number"+ maximum);

    }
}
