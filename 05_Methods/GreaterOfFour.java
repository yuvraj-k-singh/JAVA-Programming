/*
WAP: Greater Of Four
Date: 24-Dec-2025
*/

import java.util.Scanner;

public class GreaterOfFour {

    public static int greater(int a, int b, int c, int d){
        int max = Math.max(Math.max(a,b), Math.max(c,d));
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Four Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        System.out.print("\nThe greater value: "+ greater(a,b,c,d));
    }
}
