/*
WAP: Simple Interest
Date: 07-Dec-2025
*/


import java.util.Scanner;

public class SimpleInterest {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Principle: ");
        double p = sc.nextDouble();
        System.out.print("Enter value of Rate: ");
        double r = sc.nextDouble();
        System.out.print("Enter value of Time: ");
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.print("Simple interest: "+si);
    }
}
