package javapractice;
import java.util.Scanner;
public class ForEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a byte value");
        byte a=sc.nextByte();
        System.out.println("enter a int value");
        int b=sc.nextInt();
        System.out.println("enter a short value");
        short c=sc.nextShort();
        System.out.println("enter a long value");
        long d=sc.nextLong();
        System.out.println("enter a float value");
        float f=sc.nextFloat();
        System.out.println("enter a double value");
        double g=sc.nextDouble();
        System.out.println("enter a char value");
        char ch=sc.next().charAt(0);
        System.out.println("enter a String value");
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println("enter a boolean");
        boolean by=sc.nextBoolean();
    }
}


