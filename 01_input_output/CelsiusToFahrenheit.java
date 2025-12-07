/*
WAP: Convert Celsius To Fahrenheit
Date: 07-Dec-2025
*/

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of Celsius: ");
        double Celsius = sc.nextDouble();
        double Fahrenheit = (9.0/5.0*Celsius) + 32;
        System.out.print(Celsius + " Celsius to Fahrenheit is: " + Fahrenheit);
    }
}
