package javateam;

public class asd {
    public static void main(String[] args)
    {
        Customer1 c1=SingletonUtil.getInstance();
        Customer1 c2=SingletonUtil.getInstance();
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        c1.disp();
    }

}
