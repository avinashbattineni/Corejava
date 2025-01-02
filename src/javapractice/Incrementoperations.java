package javapractice;

public class Incrementoperations
{
    public static void main(String[]args)
    {
        int a=10;
        System.out.println(a++);//10
        System.out.println(++a);//12
        System.out.println(a++);//12
        System.out.println(a--);//13
        System.out.println(--a);//11
        System.out.println(a);//11
        System.out.println(++a+(--a));
        System.out.println((a+++--a)*(--a+ ++a)*(++a+a++));
        //                  (11+11)*(10+11)*(12+12)
        //                     22*21*24
       /* precedence:id
                     ++,--
                     ()
                     *,/,%
                     +,-
                     $*/


    }
}
