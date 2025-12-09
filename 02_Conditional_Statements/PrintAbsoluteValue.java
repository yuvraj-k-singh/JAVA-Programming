/*
WAP: Print Absolute Value
Date: 09-Dec-2025
*/

import java.util.Scanner;

public class PrintAbsoluteValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if(n>0){
            System.out.print("The Absolute Value of "+n+" is: "+ n);
        } else{
            System.out.print("The Absolute Value of "+n+" is: "+ (n*-1));
        }
    }
}
