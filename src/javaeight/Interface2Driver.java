package javaeight;

public class Interface2Driver {
    public static void main(String[] args) {
        Interface2 i=(int n1,int n2)->n1+n2;
        System.out.println(i.sum(10,90));
    }
}
