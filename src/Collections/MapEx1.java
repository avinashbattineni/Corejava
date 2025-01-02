package Collections;

import java.util.*;

public class MapEx1 {
    public static void main(String[] args) {
        Map m = new HashMap<>();
        m.put(1, "Vedhya");
        m.put(2, "Agastya");
        m.put(3, "Radhya");
        m.put(null,null);
        m.put(4,null);
        System.out.println(m);
        System.out.println(m.size());
        System.out.println(m.get(Optional.of(3)));
        System.out.println(m.containsKey(2));
        System.out.println(m.remove(1));
        System.out.println(m.containsValue("Radhya"));
        Set<Integer> s=m.keySet();
        //Iterator<String>i=s.iterator();
        Iterator<Integer> i = s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }




}
