/*
WAP: Pascal Triangle
Date: 24-Dec-2025
*/

import java.util.Scanner;

public class PascalTriangle {

    public static int fact(int n){
        int f = 1;
        for(int i=1 ;i<=n; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println();
        for(int i=0; i<=n; i++){
            for(int k = n-1; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                int num = fact(i)/(fact(j)*fact(i-j));
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }
}
