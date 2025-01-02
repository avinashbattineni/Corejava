package javapractice;

public class Biggestnumber
{
    public static void main(String[]args)
    {
        int a=10;
        int b=10;
        int c=10;
        System.out.println("a value is :"+ a);
        System.out.println("b value is :"+ b);
        System.out.println("c value is:"+ c);

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is bigger");
            }
            else
            {
             System.out.println("b is bigger");
            }
        }
        else if (b>a)
        {
            if(b>c)
            {
                System.out.println("b is bigger");
            }
            else
            {
                System.out.println("c is bigger");
            }
        }
        else if (c>a)
        {
            if (c>b)
            {
                System.out.println("c is bigger");
            }
            else
            {
                System.out.println("b  is bigger");

            }
        }
        else
        {
           System.out.println("a,b,c are equal");
        }

    }
}
