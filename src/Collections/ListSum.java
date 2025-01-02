package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListSum {
    public static void main(String[] args) {
        int sum=0;
        double avg=0;
        List<Integer>l1=new ArrayList<>();
        l1.add(Integer.valueOf(1));
        l1.add(Integer.valueOf(2));
        l1.add(Integer.valueOf(4));
        l1.add(Integer.valueOf(8));
        for(int i=0;i<l1.size();i++)
        {
            sum=sum+l1.get(i);
            avg=(double)sum/l1.size();
        }
        System.out.println(sum);
        System.out.println(avg);
    }
}
