/*
WAP: Time Converter
Date: 07-Dec-2025
*/

import java.util.Scanner;

public class TimeConverter {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of total seconds: ");
        int total_sec = sc.nextInt();

        int hour = total_sec/3600;
        total_sec %= 3600;

        int min = total_sec/60;
        int sec = total_sec%60;

        System.out.println();
        System.out.println("Hours: "+hour);
        System.out.println("Minutes: "+min);
        System.out.println("Seconds: "+sec);
        System.out.print("Time:- "+hour+" : "+min+" : "+sec);
    }
}
