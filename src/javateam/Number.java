package javateam;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println(number+" is Positive number");
        } else if (number < 0) {
            System.out.println(number+" is Negative number");
        } else {
            System.out.println(number+ " is the number is Zero");
        }
    }
}