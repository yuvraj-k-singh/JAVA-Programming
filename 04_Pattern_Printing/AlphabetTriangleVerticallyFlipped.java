/*
WAP: Alphabet Triangle Vertically Flipped
Date: 18-Dec-2025

      A
    B B
  C C C
D D D D

*/

import java.util.Scanner;

public class AlphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int k = n - 1; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
    }
}
