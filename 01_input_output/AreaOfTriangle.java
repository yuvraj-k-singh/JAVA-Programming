/*
WAP: Calculate Area Of Triangle
Date: 07-Dec-2025
*/

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the Height of triangle: ");
        double height = sc.nextDouble();

        System.out.println();
        double area = 1.0/2.0*base*height;
        System.out.printf("Area of Triangle: %.2f", area);
    }
}
