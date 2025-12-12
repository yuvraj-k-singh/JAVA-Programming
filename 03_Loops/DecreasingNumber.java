/*
WAP: Decreasing Number
Date: 12-Dec-2025
*/

import java.util.Scanner;

public class DecreasingNumber {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("\nNumbers from "+n+" to 1 is: ");
        for(int i=n ; i>=1; i--) System.out.print(i+" ");
    }
}

