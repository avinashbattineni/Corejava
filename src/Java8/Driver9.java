package Java8;

public class Driver9 {
    public static void main(String[] args) {
         FInterface9 f=()->
    {
        String str="abhi";
        return str.length();
    };
        int result= f.get();
        System.out.println(result);
    }
}
