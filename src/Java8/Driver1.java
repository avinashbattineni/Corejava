package Java8;

public class Driver1 {
    public static void main(String[] args) {
        FInterface1 f=(int n1, int n2) ->System.out.println(n1+n2);
        f.sum(10,90);
    }
}
