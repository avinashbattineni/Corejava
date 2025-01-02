package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class List10 {
    public static void main(String[] args) {
        List<Integer> ls=new ArrayList<>();
        ls.add(1);
        ls.add(3);
        ls.add(5);
        ls.add(7);
        ls.add(9);
        Optional<Integer> op=ls.stream().min((v1, v2)->v1.compareTo(v2));
        if(op.isPresent())
        {
            System.out.println(op.get());
        }
    }

}