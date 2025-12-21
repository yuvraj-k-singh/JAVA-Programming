/*
WAP: Number Pascal Triangle
Date: 21-Dec-2025

   1
  1 1
 1 2 1
1 3 3 1

*/

import java.util.Scanner;

public class NumberPascalTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println();
        for(int i=1; i<=n; i++){
            for(int k=n-1; k>=i; k--){
                System.out.print(" ");
            }
            int x = 1;
            for(int j=1; j<=i; j++){
                System.out.print(x + " ");
                x = x*(i-j)/j;
            }
            System.out.println();
        }
    }
}
