package Java8;

import java.util.ArrayList;
import java.util.List;

public class List4 {
    //list sorting in ascending order
        public static void main(String[] args) {
            List<String> ls = new ArrayList<>();
            ls.add("abc");
            ls.add("stu");
            ls.add("abc");
            ls.add("jkl");
            ls.add(null);
            ls.stream().filter(x->x!=null).sorted().forEach((a)->
            {
                System.out.println(a);
            });
        }
    }


