package String;

public class String1 {
    public static void main(String[] args) {
        String s1 = "welcome";
        String s2 ="abhi";
        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());
        System.out.println(s1);
        System.out.println(s2);
        String s3=s1.substring(1,4);
        System.out.println(s3);

        }
    }

