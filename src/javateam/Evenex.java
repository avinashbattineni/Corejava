package javateam;

import java.util.Scanner;

public class Evenex
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number");
        int number=sc.nextInt();
        if(number%2==0)
        {
            System.out.println("the number is even");
        }

    }
}
