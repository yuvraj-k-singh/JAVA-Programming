/*
WAP: Print N Times
Date: 04-oct-2026
*/

import java.util.Scanner;

public class PrintNTimes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        System.out.println();
        print(1, n);
    }

    public static void print(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Yuvraj");
        print(i+1, n);
    }
}
