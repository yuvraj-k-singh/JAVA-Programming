/*
WAP: Sides Of Triangle
Date: 10-Dec-2025
*/

import java.util.Scanner;

public class SideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first side of triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the second side of triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter the third side of triangle: ");
        int c = sc.nextInt();

        System.out.println();
        if((a+b)>c && (a+c)>b && (b+c)>a){
            System.out.print("Valid Triangle!");
        } else{
            System.out.print("Invalid Triangle!");
        }
    }
}
