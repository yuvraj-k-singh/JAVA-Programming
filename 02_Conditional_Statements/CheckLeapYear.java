/*
WAP: Check Leap Year
Date: 09-Dec-2025
*/

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        short n = sc.nextShort();

        if((n%4==0 && n%100!=0) || n%400==0){
            System.out.print("The given year "+n+" is Leap Year!");
        } else{
            System.out.print("The given year "+n+" is not Leap Year!");
        }
    }
}
