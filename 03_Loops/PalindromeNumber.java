/*
WAP: Palindrome Number
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, rev = 0;

        while(n!=0){
            rev = rev*10 + n%10;
            n /= 10;
        }

        if(rev==temp){
            System.out.print("\nThe given number "+temp+ " is a Palindrome Number!");
        } else System.out.print("\nThe given number "+temp+ " is not a Palindrome Number!");
    }
}
