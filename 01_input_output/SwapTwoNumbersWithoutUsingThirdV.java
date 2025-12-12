/*
WAP: Swap Two Numbers Without Using Third Variable
Date: 12-Dec-2025
*/


import java.util.Scanner;

public class SwapTwoNumbersWithoutUsingThirdV {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int a = sc.nextInt();
        System.out.print("Enter the second value: ");
        int b = sc.nextInt();

        System.out.println("\nThe values Before swapping is: ");
        System.out.println("A : "+a+ " and B: "+b);

        //swapping logic
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("\nThe values After swapping is: ");
        System.out.print("A : "+a+ " and B: "+b);
    }
}
