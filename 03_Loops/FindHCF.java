/*
WAP: Find HCF
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class FindHCF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        int hcf = 1;

        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.printf("\nThe HCF of %d and %d numbers is: %d", a, b, hcf);
    }
}
