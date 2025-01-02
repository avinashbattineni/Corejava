package javateam;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 25;
        if(a>b && a>c)
        {
            System.out.println(a+ " is bigger");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+ " is bibber");
        }
        else if(c>a && c>b)
        {
            System.out.println(c+ " is bigger");
        }
        else {
            System.out.println("All are equal");
        }
    }
}
