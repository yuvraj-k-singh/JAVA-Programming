/*
WAP: Power Of 2
Date: 08-Jan-2026
*/

import java.util.Scanner;

public class PowerOf2 {
    public static boolean powOf2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (powOf2(n))
            System.out.println("YES!");
        else
            System.out.println("NO!");
    }
}