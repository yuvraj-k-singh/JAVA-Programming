/*
WAP: Check Highest Factor
Date: 12-Dec-2025
*/

import java.util.Scanner;

public class CheckHighestFactor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i=n-1; i >= Math.sqrt(n); i--){
            if(n%i==0){
                System.out.print("\nThe highest factor of "+n+" is: "+i);
                break;
            }
        }
    }
}
