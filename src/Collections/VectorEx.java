package Collections;

import java.util.*;

public class VectorEx {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        Iterator<Integer>i=l.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
