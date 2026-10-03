/*
WAP: Print N to 1
Date: 04-oct-2026
*/

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        System.out.println("\nNumber from N to 1: ");
        print(n);
    }

    public static void print(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
}
