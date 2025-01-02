package javaeight;

import java.util.ArrayList;
import java.util.List;

public class ListtoStream {
    public static void main(String[] args) throws InterruptedException {
        List<String> ls=new ArrayList<>();
        ls.add("A");
        ls.add("D");
        ls.add("B");
        ls.add("A");
        ls.add("C");
        ls.add("B");
        ls.add(null);
        ls.stream().filter(y->y!=null).map(z->z.toLowerCase()).distinct().sorted().forEach((x)->
                System.out.println(x));

    }
}
