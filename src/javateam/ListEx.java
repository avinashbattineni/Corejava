package javateam;

import java.util.*;

public class ListEx
{
    public static void main(String[] args)
    {
        /*methods in list
          add()----creating record
          size()----size of list
          get()---reading the record
          indexOf()
          clear()--delete record
          sort()--sort records
          remove()--delete record
          contains()--to check record
          isEmpty()
          retainAll()
          set()--update record
         */
        List<Integer> numbers=new Vector<>();//implementation classes ArrayList,LinkedList,Vector,CopyOnWriteArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);
        numbers.add(34);
        numbers.add(56);
        numbers.add(56);
        numbers.add(null);
        //Collections.sort(numbers);
        System.out.println(numbers);
    }
}
