package javateam;

public class BinarySearch {
        public static int binarySearch(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Check if target is at the mid
                if (arr[mid] == target) {
                    return mid; // Target found, return the index
                }

                if (arr[mid] > target) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
            int target = 7;
            int result = binarySearch(arr, target);
            if (result == -1) {
                System.out.println("Element not found in the array.");
            } else {
                System.out.println("Element found at index: " + result);
            }
        }
    }


