package javaeight;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Set2List {
    public static void main(String[] args) {
        Set<Integer>s=new HashSet<>();
        s.add(1);
        s.add(3);
        s.add(7);
        s.add(4);
        List<Integer> collect=s.stream().collect(Collectors.toList());
        System.out.println(collect);
    }
}
