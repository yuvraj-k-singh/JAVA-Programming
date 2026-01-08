/*
WAP: Power Of 3
Date: 08-Jan-2026
*/

import java.util.Scanner;

public class PowerOf3 {
    public static boolean powOf3(int n) {
        if(n<=0) return false;

        while(n%3==0){
            n/=3;
        }
        return n==1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (powOf3(n))
            System.out.println("YES!");
        else
            System.out.println("NO!");
    }
}