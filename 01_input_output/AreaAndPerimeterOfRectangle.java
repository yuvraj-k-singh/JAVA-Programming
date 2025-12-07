/*
WAP: Calculate Area And Perimeter Of Rectangle
Date: 07-Dec-2025
*/

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of Rectangle: ");
        double len = sc.nextDouble();
        System.out.print("Enter the width of Rectangle: ");
        double width = sc.nextDouble();

        System.out.println();

        double area = len * width;
        double perimeter = 2*(len + width);
        System.out.println("Area of Rectangle: "+area);
        System.out.print("Perimeter of Rectangle: "+perimeter);
    }
}
