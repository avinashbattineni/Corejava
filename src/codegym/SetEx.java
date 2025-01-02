package codegym;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set s=new HashSet<>();
       /* s.add(1);
        s.add(3);
        s.add(5);
        s.add(7);
        s.add(9);
       */ System.out.println(s);
        Iterator<Integer>i=s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
