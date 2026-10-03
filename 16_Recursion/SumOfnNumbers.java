/*
WAP: Sum Of N Numbers
Date: 04-oct-2026
*/

import java.util.Scanner;

public class SumOfnNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        System.out.print("\nSum of 1 to N: "+ sum(n));
    }

    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n+sum(n-1);
    }
}
