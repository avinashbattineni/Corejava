package javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class List2Set {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(2);
        l.add(3);
        l.add(6);
        l.add(1);
        l.add(9);
        Set<Integer> collect= l.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
