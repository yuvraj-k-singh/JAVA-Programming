/*
WAP: Is Integer (Take Real no and check)
Date: 09-Dec-2025
*/


import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a real number: ");
        double n = sc.nextDouble();

        if(n == (int)n){
            System.out.print("The given number "+n+" is Integer!");
        } else{
            System.out.print("The given number "+n+" is not Integer!");
        }
    }
}
