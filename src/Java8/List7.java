package Java8;

import java.util.ArrayList;
import java.util.List;

public class List7 {
    //skip example
        public static void main(String[] args) {
            List<String> ls = new ArrayList<>();
            ls.add("abc");
            ls.add("def");
            ls.add("ghi");
            ls.add("jkl");
            ls.add(null);
            ls.stream().filter(x->x!=null).skip(2).forEach((a)->
            {
                System.out.println(a);
            });
        }
    }


