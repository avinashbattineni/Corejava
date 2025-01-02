package javateam;

import java.util.ArrayList;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) throws InterruptedException
    {
        List<String> lst=new ArrayList<String>();
        lst.add("B");
        lst.add("C");
        lst.add("A");
        lst.add("B");
        lst.stream()
                .peek(n-> System.out.println(n))
                .map((s->s+'b'))
                .forEach(
                (x)->
                {
                    System.out.println(x);
                });
    }
}


