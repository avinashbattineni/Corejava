package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class List8 {
    //list concatenation
        public static void main(String[] args) {
            List<Integer> ls = new ArrayList<>();
            ls.add(2);
            ls.add(4);
            ls.add(6);
            ls.add(8);
            ls.add(null);
            Optional<Integer>op=ls.stream().filter(x->x!=null).reduce((x,y)->x+y);
            {
                if(op.isPresent())
                {
                    System.out.println(op.get());
                }
            }
            }
    }


