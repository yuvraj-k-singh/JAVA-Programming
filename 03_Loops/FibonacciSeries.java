/*
WAP: Fibonacci Series - 0 1 1 2 3 5 8
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0, b = 1;

        System.out.println("\nThe fibonacci series are: ");
        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;
        }
    }
}
