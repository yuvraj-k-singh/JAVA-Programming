/*
WAP: Permutation
Date: 24-Dec-2025
*/

import java.util.Scanner;

public class Permutation {
    public static int fact(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of R: ");
        int r = sc.nextInt();

        int npr = fact(n)/fact(n-r);

        System.out.printf("\nThe permutation of %dN and %dR is: %d", n, r, npr);
    }
}
