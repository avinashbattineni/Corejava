package javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class MaxInList {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(5);
        l.add(3);
        l.add(7);
        l.add(2);
        l.add(9);
        Optional<Integer>op=l.stream().min((v1,v2)->v1.compareTo(v2));
        if(op.isPresent())
        {
            System.out.println(op.get());
        }
    }
}
