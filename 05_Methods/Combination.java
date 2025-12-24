/*
WAP: Combination
Date: 24-Dec-2025
*/

import java.util.Scanner;

public class Combination {
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

        int ncr = fact(n)/(fact(r)*fact(n-r));
        System.out.println("\nThe combination of "+n+"C and "+r+"R is: "+ ncr);
    }
}
