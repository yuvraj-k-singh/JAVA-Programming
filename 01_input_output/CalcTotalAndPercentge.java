/*
WAP: Calculate total and percentage of 5 subjects
Date: 07-Dec-2025
*/

import java.util.Scanner;

public class CalcTotalAndPercentge {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks out of 100: ");
        System.out.println();
        System.out.print("1st subject: ");
        int a = sc.nextInt();
        System.out.print("2nd subject: ");
        int b = sc.nextInt();
        System.out.print("3rd subject: ");
        int c = sc.nextInt();
        System.out.print("4th subject: ");
        int d = sc.nextInt();
        System.out.print("5th subject: ");
        int e = sc.nextInt();

        double total = a + b + c + d + e;
        double percentage = (total/500*100);
        System.out.println();
        System.out.println("Total marks of 5 subjects is: "+total);
        System.out.print("Total Percentage is: "+percentage);
    }
}
