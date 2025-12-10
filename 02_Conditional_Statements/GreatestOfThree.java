/*
WAP: Greatest Of Three Numbers
Date: 10-Dec-2025
*/


import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.println();
        if(a>b && a>c){
            System.out.print("The First number ("+a+") is greater number!");
        } else if(b>a && b>c){
            System.out.print("The Second number ("+b+") is greater number!");
        } else{
            System.out.print("The Third number ("+c+") is greater number!");
        }
    }
}
