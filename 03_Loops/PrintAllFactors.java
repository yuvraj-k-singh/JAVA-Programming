/*
WAP: Print All Factors
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class PrintAllFactors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("\nAll factors of "+n+" are: ");
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                System.out.print(i + " ");
                if(i!=n/i){
                    System.out.print(n/i + " ");
                }
            }
        }
    }
}
