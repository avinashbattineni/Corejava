package javateam;
import java.util.Scanner;
public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int side1 = sc.nextInt();
        System.out.println("Enter the second side: ");
        int side2 = sc.nextInt();
        System.out.println("Enter the Third side: ");
        int side3 = sc.nextInt();
        if(side2+side3>side1 && side1+side3>side2 && side1+side2>side3)
        {
            System.out.println("possible to construct triangle");
        }
        else {
            System.out.println("not possible to construct triangle");
        }
    }
}
