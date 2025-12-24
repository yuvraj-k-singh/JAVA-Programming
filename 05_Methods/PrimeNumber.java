/*
WAP: Prime Number
Date: 24-Dec-2025
*/

import java.util.Scanner;

public class PrimeNumber {
    public static boolean prime(int n){

        if(n==1) return false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of number: ");
        int n = sc.nextInt();

        if(n<0){
            System.out.print("\nNegative number are neither Prime nor Composite!");
            return;
        }

        if(prime(n)){
            System.out.printf("\nThe given number %d is Prime Number!", n);
        } else System.out.printf("\nThe given number %d is not Prime Number!", n);
    }
}
