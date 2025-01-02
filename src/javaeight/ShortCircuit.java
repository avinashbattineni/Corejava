package javaeight;

import java.util.ArrayList;
import java.util.List;
//Short Circuit operators are anyMatch,allMatch,nonMatch,findFirst,findAny,
public class ShortCircuit {
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("hi");
        ls.add("welcome");
        ls.add("FAANG");
        ls.add("tech");
        ls.add("java");
        ls.add("lab");
        boolean flag=ls.stream().anyMatch(a->a.startsWith("java"));
        System.out.println(flag);
        boolean flag1=ls.stream().allMatch(a->a.startsWith("java"));
        System.out.println(flag1);
        boolean flag2=ls.stream().noneMatch(a->a.startsWith("java"));
        System.out.println(flag2);

        //boolean flag=ls.stream().anyMatch(a->a.startsWith("java"));
    }
}
