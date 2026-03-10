/*
WAP: Rectangle Calculation
Date: 10-Mar-2026
*/

package ClassObjects;

import java.util.Scanner;

public class RectangleCalculation {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.setData();

        int area = r1.area();
        int perimeter = r1.perimeter();

        System.out.println("\nDetails of Rectangle: ");
        System.out.println("Area of rectangle: "+area);
        System.out.println("Perimeter of rectangle: "+perimeter);
    }
}

class Rectangle{
    int length;
    int breadth;

    void setData(){
        System.out.println("Enter details: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        length = sc.nextInt();
        System.out.print("Enter the breadth: ");
        breadth = sc.nextInt();
        sc.close();
    }

    int area(){
        return length*breadth;
    }

    int perimeter(){
        return 2*(length+breadth);
    }
}