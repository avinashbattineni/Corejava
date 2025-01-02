package javateam;

public class methodEx1 extends methodEx
{
    public int substract(int a,int b)
    {
        return (a-b);
    }

    public static void main(String[] args) {
        methodEx m=new methodEx();
        System.out.println("add 2 numbers "+m.add(10,20));
        System.out.println("add 2 numbers "+m.add(15,20));
        System.out.println("sub 2 numbers "+m.sub(10,2));
        methodEx1 m1=new methodEx1();
        System.out.println("sub 2 numbers "+m1.sub(10,5));

    }
}

