package Java8;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    //Converting list to stream
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("abhi");
        ls.add("hema");
        ls.add("vedhya");
        ls.add("agastya");
        ls.stream().forEach((x)->
                {
                    System.out.println (x);
                }
        );
    }
}
