/*
WAP: Star Pascal Triangle
Date: 21-Dec-2025

   *
  * *
 * * *
* * * *

*/

import java.util.Scanner;

public class StarPascalTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int k=n-1; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
