package Java8;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List<Integer>ls=new ArrayList<>();
        ls.add(1);
        ls.add(8);
        ls.add(9);
        ls.add(2);
        ls.stream().sorted().limit(3).forEach((x)->
        {
            System.out.println(x);
        });
    }
}
