/*
WAP: Check Greater Area Perimeter
Date: 09-Dec-2025
*/


import java.util.Scanner;

public class AreaPerimeterGreater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the Breadth of Rectangle: ");
        double breadth = sc.nextDouble();

        double area = length*breadth;
        double perimeter = 2*(length+breadth);
        System.out.println();
        if(area>perimeter){
            System.out.print("The area value "+area+" is greater than perimeter value "+perimeter+ "!");
        } else System.out.print("The perimeter value "+perimeter+" value is greater than area value "+area+ "!");
    }
}
