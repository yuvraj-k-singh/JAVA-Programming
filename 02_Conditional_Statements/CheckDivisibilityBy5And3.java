/*
WAP: Check Divisibility By 5 And 3
Date: 10-Dec-2025
*/


import java.util.Scanner;

public class CheckDivisibilityBy5And3 {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println();
        if(n%5==0 && n%3==0){
            System.out.print("The given number "+n+" is divisible by 5 and 3!");
        } else{
            System.out.print("The given number "+n+" is not divisible by 5 and 3!");
        }
    }
}
