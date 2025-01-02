package Java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<Character,Integer> m=new HashMap<>();
        m.put('a',10);
        m.put('b',20);
        m.put('d',45);
        m.put('e',59);
        m.put('c',96);
        m.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach((x)->
                System.out.println(x));
    }
}
