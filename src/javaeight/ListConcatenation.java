package javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListConcatenation {
    public static void main(String[] args) {
        List<Integer>ls=new ArrayList<>();
        ls.add(2);
        ls.add(4);
        ls.add(6);
        ls.add(8);
        Optional<Integer>op=ls.stream().reduce((x,y)->x+y);
        if (op.isPresent())
        {
            System.out.println(op.get());
        }
    }
}
