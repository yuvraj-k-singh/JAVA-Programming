/*
WAP: Print Decreasing Increasing
Date: 04-oct-2026
*/

import java.util.Scanner;

public class PrintDecreasingIncreasing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        System.out.println("\nNumber from N to 1 & to N: ");
        print(n);
    }

    public static void print(int n){
        if(n == 0) {
            return;
        }
        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
    }
}
