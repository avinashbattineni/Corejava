package Dailyproblems;

public class LastCharacter {
    public static void main(String[] args) {
        String s="avinash";
        for(int i=s.length()-1;i>s.length()-2;i--)
        {
            System.out.println(s.charAt(i));
        }
    }
}
