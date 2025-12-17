/*
WAP: Star Horizontal Flipped Triangle
Date: 17-Dec-2025

* * * * *
* * * *
* * *
* *
*

*/


import java.util.Scanner;

public class StarHorizontalFlippedTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
