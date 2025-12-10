/*
WAP: Check Points On Straight Line
Date: 10-Dec-2025
*/

import java.util.Scanner;

public class CheckPointsOnStraightLine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the (x1,y1) Coordinates: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter the (x2,y2) Coordinates: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.print("Enter the (x3,y3) Coordinates: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        System.out.println();
        if((y2-y1)/(x2-x1) == (y3-y2)/(x3-x2)){
            System.out.print("The three points lie on the same line!");
        } else System.out.print("The three points not lie on the same line!");
    }
}
