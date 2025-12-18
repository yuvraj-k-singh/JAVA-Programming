/*
WAP: Diamond
Date: 19-Dec-2025

    *
  * * *
* * * * *
  * * *
    *

*/

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println();
        //upper pyramid
        for(int i=1; i<=n; i++){
            for(int k=n-1; k>=i; k--){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower pyramid
        for(int i=n-1; i>=1; i--){
            for(int k=n-1; k>=i; k--){
                System.out.print("  ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
