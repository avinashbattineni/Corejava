package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListtoSet {
    public static void main(String[] args) {
        List<Integer>ls=new ArrayList<>();
        ls.add(1);
        ls.add(3);
        ls.add(5);
        ls.add(7);
        ls.add(9);
        ls.add(11);
        Set<Integer> collect=ls.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
