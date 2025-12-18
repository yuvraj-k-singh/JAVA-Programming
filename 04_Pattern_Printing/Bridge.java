/*
WAP: Bridge
Date: 19-Dec-2025

* * * * * * * *
* * *     * * *
* *         * *
*             *

*/

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println();
        for(int i=1; i<=n; i++){
            //left star
            for(int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }

            //space
            for(int k=2; k<=2*i-1; k++){
                System.out.print("  ");
            }

            //right star
            for(int l=1; l<=n+1-i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
