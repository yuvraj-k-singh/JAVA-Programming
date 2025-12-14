/*
WAP: Power Calculation
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of power: ");
        int b = sc.nextInt();
        int power = 1;

        for(int i=1; i<=b; i++){
            power *= a;
        }

        System.out.print("\nThe value of "+a+" raised to power "+b+" is: "+power);
    }
}
