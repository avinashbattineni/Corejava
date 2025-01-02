package Java8;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        List<String>ls=new ArrayList<>();
        ls.add("hi");
        ls.add("all");
        ls.add("welcome");
        ls.add("to");
        ls.add("java");
        ls.add("class");
        boolean flag=ls.stream().noneMatch(a->a.startsWith("to"));
        System.out.println(flag);
    }
}
