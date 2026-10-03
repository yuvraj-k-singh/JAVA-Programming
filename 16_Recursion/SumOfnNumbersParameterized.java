/*
WAP: Sum Of N Numbers Parameterized Recursion
Date: 04-oct-2026
*/

import java.util.Scanner;

public class SumOfnNumbersParameterized {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        System.out.print("\nSum of 1 to N: ");
        s(n, 0);
    }

    public static void s(int n, int sum){
        if(n == 0){
            System.out.print(sum);
            return;
        }
        s(n-1, sum+n);
    }
}
