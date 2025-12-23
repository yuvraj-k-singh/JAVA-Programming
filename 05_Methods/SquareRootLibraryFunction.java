/*
WAP: Square Root Library Function
Date: 23-Dec-2025
*/

import java.util.Scanner;

public class SquareRootLibraryFunction {
    public static double squareRoot(double n){
        return Math.sqrt(n);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of number: ");
        double n = sc.nextDouble();

        System.out.printf("\nThe Square Root of %.2f is: %.2f", n, squareRoot(n) );
    }
}
