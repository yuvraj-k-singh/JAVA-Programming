/*
WAP: Absolute value Library Function
Date: 23-Dec-2025
*/

import java.util.Scanner;

public class AbsoluteValueLibraryFunction {
    public static int absolute(int n){
        return Math.abs(n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("\nThe absolute value of "+n+" is: "+ absolute(n));
    }
}
