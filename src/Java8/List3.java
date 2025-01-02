package Java8;

import java.util.ArrayList;
import java.util.List;
//remove null values from list
public class List3 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("abc");
        ls.add("def");
        ls.add("ghi");
        ls.add("jkl");
        ls.add(null);
        ls.stream().filter(x->x!=null).forEach((a)->
        {
            System.out.println(a);
        });
    }
}
