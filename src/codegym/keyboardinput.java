package codegym;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class keyboardinput {
    public static void main(String[]args) throws Exception
    {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name:");
        String s=r.readLine();
        System.out.println("Enter your age:");
        String n=r.readLine();
        int a=Integer.parseInt(n);
        System.out.println("your name " +s);
        System.out.println("your age " +a);


    }

}
