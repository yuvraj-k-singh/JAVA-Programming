/*
WAP: Star Triangle Vertically Flipped
Date: 18-Dec-2025

      *
    * *
  * * *
* * * *

*/

import java.util.Scanner;

public class StarTriangleVerticallyFlipped {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println();
        for(int i=1; i<=n; i++){          //for no of rows
            for(int k=n-1; k>=i; k--){    //for spaces
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){      //for printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
