package Java8;

public class Driver2 {
    public static void main(String[] args) {
        FInterface2 f = (int n1, int n2) ->n1+n2;
        System.out.println(f.add(10, 90));
    }
}
