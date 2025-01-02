package InputOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter the number of rows for the butterfly pattern: ");
                int n = sc.nextInt();

                // Upper half of the butterfly
                for (int i = 1; i < n; i++) {
                    // Left stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Spaces
                    for (int j = 1; j <= 2 * (n - i); j++) {
                        System.out.print(" ");
                    }
                    // Right stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                // Middle row
                for (int i = 1; i <= 2 * n; i++) {
                    System.out.print("*");
                }
                System.out.println();

                // Lower half of the butterfly
                for (int i = n - 1; i >= 1; i--) {
                    // Left stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    // Spaces
                    for (int j = 1; j <= 2 * (n - i); j++) {
                        System.out.print(" ");
                    }
                    // Right stars
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                sc.close();
            }
        }



