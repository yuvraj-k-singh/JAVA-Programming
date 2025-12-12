/*
WAP: Sum of AP
Date: 13-Dec-2025
*/


import java.util.Scanner;

public class SumOfAP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term: ");
        int a = sc.nextInt();
        System.out.print("Enter the common difference: ");
        int d = sc.nextInt();
        System.out.print("Enter the number of term: ");
        int n = sc.nextInt();

        int sum = (n*(2*a + (n-1)*d))/2;
        System.out.print("The sum of given AP is: "+sum);

    }
}
