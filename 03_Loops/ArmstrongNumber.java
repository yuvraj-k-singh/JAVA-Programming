/*
WAP: Palindrome Number
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a  number: ");
        int n = sc.nextInt();
        int temp = n, rem = 0, arm = 0;

        while(n!=0){
            rem = n%10;
            arm += rem*rem*rem;
            n /= 10;
        }

        if(arm==temp){
            System.out.print("\nThe given number "+temp+" is a Armstrong Number!");
        } else System.out.print("\nThe given number "+temp+" is not a Armstrong Number!");
    }
}
