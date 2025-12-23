/*
WAP: Floor Ceiling Library Function
Date: 23-Dec-2025
*/

import java.util.Scanner;

public class FloorCeilingLibraryFunction {

    public static void floorCeil(double n){
        System.out.println("\nThe floor value of "+n+" is: "+ Math.floor(n));
        System.out.print("The ceiling value of "+n+" is: "+ Math.ceil(n));
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        floorCeil(n);
    }
}
