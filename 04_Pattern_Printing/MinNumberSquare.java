/*
WAP: Min Number Square
Date: 19-Dec-2025

1 1 1 1
1 2 2 2
1 2 3 3
1 2 3 4

*/

import java.util.Scanner;

public class MinNumberSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(Math.min(i,j) + " ");
            }
            System.out.println();
        }
    }
}
