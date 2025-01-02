package javateam;
import java.util.Scanner;
public class GradeCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student marks: ");
        int marks = sc.nextInt();
        if(marks>=80 )
        {
            System.out.println("student secured A grade");
        }
        else if(marks>=65 && marks<=79)
        {
            System.out.println("student secured B grade");
        } else if (marks>=55 && marks<=64) {
            System.out.println("student secured C grade");
        }
        else if(marks>=50  && marks<=54)
        {
            System.out.println("student secured D grade");
        }
        else {
            System.out.println("student failed");
        }
    }
}
