/*
WAP: Print Table
Date: 12-Dec-2025
*/

import java.util.Scanner;

public class PrintTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n number: ");
        int n = sc.nextInt();

        System.out.println("\nTable of "+n+" is: ");
        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+ n*i);
        }
    }
}
