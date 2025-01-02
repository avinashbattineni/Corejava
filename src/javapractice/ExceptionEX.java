package javapractice;

public class ExceptionEX {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("can't divisible by 0");
        }
        finally
        {
            System.out.println("exception handled");
        }
    }
    }
