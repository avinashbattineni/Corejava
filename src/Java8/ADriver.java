package Java8;

public class ADriver {
    public static void main(String[] args) {
        A a=AImpl::add;
        int result=a.sum(10,20);
        System.out.println(result);
    }
}
