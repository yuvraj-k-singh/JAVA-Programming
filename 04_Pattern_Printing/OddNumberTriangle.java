/*
WAP: Odd Number Triangle
Date: 17-Dec-2025

1
1 3
1 3 5
1 3 5 7

*/

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int x;

        System.out.println();
        for(int i=1; i<=n; i++){
            x = 1;
            for(int j=1; j<=i; j++){
                System.out.print(x + " ");
                x+=2;
            }
            System.out.println();
        }
    }
}
