package String;

public class ImmutableEx {
    public static void main(String[] args) {
        String s1="welcome";
        s1.toUpperCase();
        System.out.println(s1);
//string buffer is mutable
        StringBuffer str=new StringBuffer("welcome");
        String s=str.toString();
        System.out.println(s);

        String a="hi all";
        StringBuffer b=new StringBuffer(a);
        System.out.println(a);
    }
}
