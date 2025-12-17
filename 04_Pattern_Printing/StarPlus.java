/*
WAP: Star Plus
Date: 17-Dec-2025

    *
    *
* * * * *
    *
    *

*/

import java.util.Scanner;

public class StarPlus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n (odd): ");
        int n = sc.nextInt();
        int mid;
        //check odd condition and calc mid
        if(n%2 == 0){
            System.out.print("Please enter only odd number for n value!");
            return;
        } else {
            mid = n/2 + 1;
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==mid || j==mid){
                    System.out.print("* ");
                } else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
