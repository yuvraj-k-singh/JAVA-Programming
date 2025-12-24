/*
WAP: Greater Of Three
Date: 24-Dec-2025
*/

import java.util.Scanner;

public class GreaterOfThree {

    public static void greater(int a, int b, int c){
        System.out.print("Greater number: "+ Math.max(Math.max(a,b),c));
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Three Numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        greater(a,b,c);
    }
}
