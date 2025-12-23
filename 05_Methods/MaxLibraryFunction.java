/*
WAP: Max Library Function
Date: 23-Dec-2025
*/

import java.util.Scanner;

public class MaxLibraryFunction {

    public static int max(int a, int  b){
        return Math.max(a, b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("\nThe maximum value is: " + max(a,b));
    }
}
