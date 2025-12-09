/*
WAP: Check 5 Divisibility
Date: 07-Dec-2025
*/

import java.util.Scanner;

public class Check5Divisibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n%5==0) {
            System.out.print("The given number " + n + " is divisible by 5!");
        } else{
            System.out.print("The given number " + n + " is not divisible by 5!");
        }
    }
}
