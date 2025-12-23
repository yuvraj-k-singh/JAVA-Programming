/*
WAP: Power Library Function
Date: 23-Dec-2025
*/

import java.util.Scanner;

public class PowerLibraryFunction {

    public static int  powerCalc(int b, int p){
        return Math.powExact(b, p);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Base Number: ");
        int base = sc.nextInt();
        System.out.print("Enter the Power value: ");
        int power = sc.nextInt();

        System.out.print("\nThe " + base + " raised to the power of " + power + " is: " + powerCalc(base, power));
    }
}
