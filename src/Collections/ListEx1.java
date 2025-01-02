package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(2);
        l.add(2);
        l.add(2);
        l.add(3,4);
        l.set(5,6);
        l.addAll(l1);
        System.out.println(l.lastIndexOf(2));
        System.out.println(l);

        l.removeAll(l1);
        //l.clear();
        //System.out.println(l);
        //System.out.println(l.get(3));
       // System.out.println(l1);
        System.out.println(l);
        //System.out.println(l.size());
    }

}
