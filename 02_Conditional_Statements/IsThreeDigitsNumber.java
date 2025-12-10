/*
WAP: Is Three Digits Number
Date: 10-Dec-2025
*/

import java.util.Scanner;

public class IsThreeDigitsNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number: ");
        int n = sc.nextInt();

        System.out.println();
        if(n>99 && n<1000){
            System.out.print("The given number "+n+" is three digit number!");
        } else{
            System.out.print("The given number "+n+" is not three digit number!");
        }
    }
}
