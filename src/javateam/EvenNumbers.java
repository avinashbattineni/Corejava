package javateam;
import java.util.Scanner;
public class EvenNumbers
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int i=sc.nextInt();
            if(i%2==0)
            {
                System.out.println(i+" is even number");
            }
            else {
                System.out.println(i+" is odd number");
            }
    }
}
