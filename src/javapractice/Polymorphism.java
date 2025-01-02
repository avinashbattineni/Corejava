package javapractice;

public class Polymorphism {
    public void sum(int n1,int n2)
    {
        System.out.println(n1+n2);
    }
    public void sum(int n1,int n2,int n3)
    {
        System.out.println(n1+n2+n3);
    }
    public static void main(String[] args) {
        Polymorphism p=new Polymorphism();
        p.sum(10,20);
        p.sum(10,20,30);
    }
}
