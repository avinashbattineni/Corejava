package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamtoList {
    public static void main(String[] args) {
        List<Integer>ls=new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(4);
        ls.add(5);
        ls.add(7);
        ls.add(8);
        List<Integer>collect=ls.stream().collect(Collectors.toList());
        System.out.println(collect);
    }
}
