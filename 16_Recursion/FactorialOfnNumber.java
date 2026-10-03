/*
WAP: Factorial Of N Number
Date: 04-oct-2026
*/

import java.util.Scanner;

public class FactorialOfnNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        int ans = fact(n);
        System.out.print("Factorial of N: "+ans);
    }

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        return n*fact(n-1);
    }
}
