package javapractice;

public class InheritanceMain {
    public static void main(String[] args) {
        Inheritance1 i=new Inheritance1();
        int sum = i.sum(10, 20);
        System.out.println("inheritace1 sum is"+sum);

        Inheritance2 i2=new Inheritance2();
        int a=i2.sum(1,2);
        int b= i2.sub(50,60);

        System.out.println("inheritace2 sum is "+a);
        System.out.println("inheritace2 subtraction is "+b);


        Inheritance3 i3=new Inheritance3();
        int addition=i3.sum(1,5);
        int subtraction=i3.sub(5,10);
                int multiplication=i3.mul(10,3);

        System.out.println("inheritace3 sum is "+addition);
        System.out.println("inheritace3 sub is "+subtraction);
        System.out.println("inheritace3 mul is "+multiplication);

    }
}
