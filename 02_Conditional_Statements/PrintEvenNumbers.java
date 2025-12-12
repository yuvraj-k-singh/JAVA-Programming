/*
WAP: Print Even Numbers
Date: 12-Dec-2025
*/


import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n numbers: ");
        int n = sc.nextInt();

        System.out.println("\nEven numbers from 1 to "+n+" is: ");
        for(int i=1; i<=n; i++){
            if(i%2==0) System.out.print(i+" ");
        }
    }
}
