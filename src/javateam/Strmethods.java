public class Strmethods
{
    public static void main(String[] args)
    {
        /*startsWith, endsWith,contains,equals,equalsIgnoreCase,length,trim,toLowerCase,toLowerCase,toCharArray
         */
        String s1="hello1";
        String s2=new String("hello");
        String s3="hELLo";
        String s4=" hello world ";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.contains("l"));
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.endsWith("le"));
        System.out.println(s1.length());
        System.out.println(s4.trim());
        System.out.println(s1.toUpperCase());
        System.out.println(s3.toLowerCase());
        char [] a=s1.toCharArray();
        System.out.println(a);

    }
}
