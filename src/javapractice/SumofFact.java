package javapractice;
import java.util.Scanner;
public class SumofFact {
    public static  int factorial(int number)
    {
    int fact = 1;
     for(int i = 1; i<= number; i++)
    {
        fact =fact* i;
    }
            return fact;
}
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int sum=0;
        while(number>0)
        {
            int digit=number%10;
            sum=sum+factorial(digit);
            number=number/10;
        }
    System.out.println(sum);

    }
}
