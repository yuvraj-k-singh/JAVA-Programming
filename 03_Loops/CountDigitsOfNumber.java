/*
WAP: Count Digits Of Number
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0, temp = n;

        //if user enter zero then initially it shows zero as total count, but actually zero is one digit no.
        if(n==0) count = 1;

        while(n!=0){
            count++;
            n /= 10;
        }

        System.out.print("\nThe total number of digits in "+temp+" number is: "+count);
    }
}
