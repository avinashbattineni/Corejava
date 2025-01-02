package javaeight;

import java.util.ArrayList;
import java.util.List;

public class LimitMethod {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("a");
        ls.add("a");
        ls.add("a");
        ls.add("c");
        ls.add("d");
        ls.add("b");
        ls.add(null);
        ls.stream().distinct().limit(3).filter(y->y!=null).skip(2).forEach(x->
                System.out.println(x));
    }
}
