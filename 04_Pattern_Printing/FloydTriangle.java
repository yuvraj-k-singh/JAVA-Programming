/*
WAP: Floyd Triangle
Date: 17-Dec-2025

1
2 3
4 5 6
7 8 9 10

*/

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int x = 1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
