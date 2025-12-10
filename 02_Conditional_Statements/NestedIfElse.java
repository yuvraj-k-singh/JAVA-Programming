/*
WAP: Nested If Else
Date: 10-Dec-2025
*/

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the three different values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println();
        if(a>b){
            if(a>c){
                System.out.print("A is greater!");
            } else System.out.print("C is greater!");
        } else{
            if(b>c){
                System.out.print("B is greater!");
            } else System.out.print("C is greater!");
        }
    }
}
