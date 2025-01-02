package javateam;
import java.util.HashSet;
public class NandDouble {
    public static boolean checkIfExist(int[] arr)
    {
            HashSet<Integer> h = new HashSet<>();

            for (int num : arr) {
                if (h.contains(2 * num) || (num % 2 == 0 && h.contains(num / 2))) {
                    return true;
                }
                h.add(num);
            }
            return false;
        }
        public static void main(String[] args) {
            int[] arr1 = {10, 2, 5, 3};
            int[] arr2 = {3, 1, 7, 11};

            System.out.println("Example 1 Output: " + checkIfExist(arr1)); // true
            System.out.println("Example 2 Output: " + checkIfExist(arr2)); // false
        }
    }

