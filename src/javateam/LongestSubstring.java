package javateam;
import java.util.HashSet;
public class LongestSubstring {
    public static void main(String[] args) {
                String input = "avinash";
                System.out.println( longestSubstring(input));
            }
            public static String longestSubstring(String s) {
                String longest = "";
                String current = "";
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (!current.contains(String.valueOf(ch))) {
                        current += ch;
                    } else {
                        if (current.length() > longest.length()) {
                            longest = current;
                        }
                        current = current.substring(current.indexOf(ch) + 1) + ch;  }
                }
                 if (current.length() > longest.length()) {
                    longest = current;
                }
                 return longest;
            }
        }
