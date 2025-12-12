/*
WAP: Swap Two Numbers Using Third Variable
Date: 12-Dec-2025
*/

import java.util.Scanner;

public class SwapTwoNumbersUsingThirdV {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value: ");
        int a = sc.nextInt();
        System.out.print("Enter the second value: ");
        int b = sc.nextInt();

        System.out.println("\nThe values before swapping is: ");
        System.out.println("A : "+a+ " and B: "+b);

        //swapping logic
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nThe values After swapping is: ");
        System.out.print("A : "+a+ " and B: "+b);
    }
}
