package javateam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx
{
    public static void main(String[] args) {
        Set<String> s=new HashSet<>();
        s.add("abc");
        s.add("vj");
        s.add("devaki");
        s.add("sanjay");
        s.add("shivani");
        System.out.println(s);
        Iterator<String> i=s.iterator();
        s.remove("vj");
        while(i.hasNext())
        {
            String names=i.next();
            if(names.equals("vj"))
            {
                i.remove();
            }
            }
        System.out.println(s);


    }
}
