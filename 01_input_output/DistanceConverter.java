/*
WAP: Distance Converter
Date: 07-Dec-2025
*/

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of kilometers: ");
        int km = sc.nextInt();

        int m = km*1000, cm = km*100000, mm = km*1000000;

        System.out.println();
        System.out.println("Meter: "+m);
        System.out.println("CentiMeter: "+cm);
        System.out.print("MilliMeter: "+mm);
    }
}
