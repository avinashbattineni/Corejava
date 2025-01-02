package javapractice;
public class Polymorphism2  extends Polymorphism{
    @Override
    public void sum(int n1, int n2) {
        System.out.println(n1-n2);
    }
    @Override
    public void sum(int n1, int n2, int n3) {
        System.out.println(n1-n2-n3);
    }
    public static void main(String[] args) {
        Polymorphism p=new Polymorphism2();
        Polymorphism p1=new Polymorphism();
        p.sum(20,10);
        p.sum(50,30,10);
        p1.sum(20,10);
        p1.sum(50,50);
    }
}
