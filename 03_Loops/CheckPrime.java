/*
WAP: Check Prime
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n <= 1){
            System.out.print("\nThe given number " + n + " is neither prime nor composite!");
            return;
        }

        boolean flag = true;    //prime = true

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }

        if(flag) System.out.print("\nThe given number "+n+" is a Prime number!");
        else System.out.print("\nThe given number "+n+" is a Composite number!");
    }
}
