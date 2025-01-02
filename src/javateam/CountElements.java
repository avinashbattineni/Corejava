package javateam;
import java.util.HashMap;

public class CountElements {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println("Number of elements with maximum frequency: " + countMaxFrequency(nums));

    }

    public static int countMaxFrequency(int[] nums) {
        int maxFrequency = 0, countMax = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentFrequency = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    currentFrequency++;
                }
            }
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                countMax=1;
                } else if (currentFrequency == maxFrequency) {
                countMax++; }
        }

        return countMax;
    }
}


