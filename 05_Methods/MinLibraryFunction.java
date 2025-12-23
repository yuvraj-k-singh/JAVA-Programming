/*
WAP: Min Library Function
Date: 23-Dec-2025
*/

import java.util.Scanner;

public class MinLibraryFunction {
    public static int min(int a, int b){
        return Math.min(a, b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("\nThe minimum value is: "+min(a,b));
    }
}
