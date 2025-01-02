package codegym;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class keyboard
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("enter your name:");
        String name=s.nextLine();
        System.out.println("Enter your age:");
        int age=s.nextInt();
        System.out.println("your salary:");

        String salary=s.nextLine();
        int n = Integer.parseInt(salary);
        //int a=Integer.Int(salary);

        System.out.println("your name is "+ name);
        System.out.println("your age is "+ age);
        System.out.println("your salary is"+ n);








    }
}
