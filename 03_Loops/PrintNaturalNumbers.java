/*
WAP: Print Natural Numbers
Date: 12-Dec-2025
*/


import java.util.Scanner;

public class PrintNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("\nNaturals from from 1 to "+n+" is: ");
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }
}
