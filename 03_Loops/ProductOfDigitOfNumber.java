/*
WAP: Product Of Digit Of Number
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class ProductOfDigitOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, multi = 1;

        while(n!=0){
            multi *= n%10;
            n /= 10;
        }

        System.out.print("\nThe multiplication of digit of "+temp+" number is: "+((multi>0) ? multi : -1*multi));
    }
}
