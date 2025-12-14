/*
WAP: Reverse Of Number
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, rev = 0;

        while(n!=0){
            rev = rev*10 + n%10;
            n /=10;
        }

        System.out.print("\nThe reverse of "+temp+" number is: "+ rev);
    }
}
