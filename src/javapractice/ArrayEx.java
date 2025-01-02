package javapractice;

public class ArrayEx {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{6, 7, 8, 9, 0};
        for (int i = a.length-1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}
