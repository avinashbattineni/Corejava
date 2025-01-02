package javapractice;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=sc.nextInt();
        System.out.println("Enter b value:");
        int b=sc.nextInt();
        int power=1;
        for(int i=1;i<=b;i++)
        {
            power=power*a;

        }
        System.out.println(power);

    }
}
