/*
WAP: Check Highest Factor
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class CheckHighestFactor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n==1) {
            System.out.print("\nThe  given number 1 is nor prime neither composite, has factor 1!");
            return;
        }

        int high_fact = 1;

        for(int i=2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                high_fact = n/i;
                break;
            }
        }
        if(high_fact == 1){
            System.out.print("\nNo highest factor, given number "+n+" is prime  number!");
        } else System.out.print("\nThe highest factor of given number "+n+" is: "+high_fact);
    }
}
