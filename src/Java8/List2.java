package Java8;

import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(3);
        ls.add(5);
        ls.add(6);
        ls.add(1);
        ls.add(2);
        ls.stream().distinct().forEach((x)->
        {
            System.out.println(x);
        });
    }
}
