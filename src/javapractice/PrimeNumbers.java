package javapractice;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter l value:");
        int l=sc.nextInt();
        System.out.println("Enter r value:");
        int r=sc.nextInt();
        for(int i=l;i<=r;i++)
        {
            if(i<=1)
            {
               continue;
            }
            boolean isprime=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                     isprime= false;
                    break;
                }
            }
            if(isprime)
            {
                System.out.println(i);
            }
        }
    }
}
