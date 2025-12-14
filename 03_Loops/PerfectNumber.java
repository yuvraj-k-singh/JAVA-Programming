/*
WAP: Perfect Number - are those number whose sum of all proper divisor except itself is equal to number.
     example: 6 - 1+2+3==6, 28 = 1+2+4+7+14 == 28
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n, sum = 0;

        for(int i=1; i<n; i++){
            if(temp%i==0){
                sum += i;
            }
        }

        if(sum==n){
            System.out.print("The given number "+n+" is a perfect number!");
        } else System.out.print("The given number "+n+" is not a perfect number!");
    }
}
