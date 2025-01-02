package thread;

/*public class StringEx {
    public static void main(String[] args) {
        StringEx s = new StringEx();
        int occurance= s.disp('a');
        System.out.println(occurance);
        StringEx s1=new StringEx();
        int occurance1=s.disp('v');
        System.out.println(occurance1);


    }

    String str = "avinash";
    char ele;
    int count = 0;

    public int disp(int ele)
    {

        for (int i = 0; i < str.length(); i++)
        {
            if (ele == str.charAt(i))
            {
                count++;
            }
            }
        return count;

    }
}*/


import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public static void main(String args[]){
        String a = "edrg34gregg34t34g346JHJDSHFIDFB";
        //String a=null;
        Map<Character, Integer> mp = new HashMap<Character, Integer>();
        for (char ch: a.toCharArray()){
            if(mp.get(ch) == null) {
                mp.put(ch, 1);
            }
            else {
                mp.put(ch, mp.get(ch)+1);
            }
        }
        System.out.println(mp);
    }
}
