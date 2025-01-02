package javateam;

import java.util.*;

public class arrayduplicate
{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read input size and array elements
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            // Call the function and get the result
            int k = removeDuplicates(nums);

            // Print the result
            System.out.print(k);
        }

        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            // Pointer to the position of the last unique element
            int uniqueIndex = 0;

            for (int i = 0; i < nums.length; i++) {
                // If current element is different from the last unique element, update the array
                if (nums[i] != nums[uniqueIndex]) {
                    uniqueIndex++;
                    nums[uniqueIndex] = nums[i];
                }
            }

            // Return the count of unique elements
            return uniqueIndex + 1;
        }
    }


