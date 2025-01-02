package javaeight;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx {
        public static void main(String[] args) throws InterruptedException
        {
            Map<Integer,String> mp=new LinkedHashMap<Integer,String>();
            mp.put(2, "B");
            mp.put(1,"A");
            mp.put(3,"C");
            mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(
                    (k)->
                    {
                        System.out.println(k);
                    });
        }
    }


