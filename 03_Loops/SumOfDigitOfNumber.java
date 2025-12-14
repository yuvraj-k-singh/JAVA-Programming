/*
WAP: Sum Of Digit Of Number
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class SumOfDigitOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while(n!=0){
            sum += n%10;
            n /= 10;
        }

        System.out.print("\nThe sum of digit of "+temp+" number is: "+ ((sum>=0) ? sum : -sum));
    }
}
