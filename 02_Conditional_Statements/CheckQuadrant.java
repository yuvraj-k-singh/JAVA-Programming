/*
WAP: Check Quadrant
Date: 10-Dec-2025
*/

import java.util.Scanner;

public class CheckQuadrant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the (x,y) coordinates: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x<0 && y<0){
            System.out.print("In 4th Quadrant");
        } else if(x<0 && y>0){
            System.out.print("In 3rd Quadrant");
        } else if(x>0 && y<0){
            System.out.println("In 2nd Quadrant");
        } else if(x==0 && y==0){
            System.out.print("At origin");
        } else{
            System.out.print("In 1st Quadrant");
        }
    }
}


