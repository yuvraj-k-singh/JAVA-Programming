/*
WAP: Int To Strings
Date: 03-Sep-2026
*/

import java.util.Scanner;

public class IntToStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of Integer: ");
        int x = sc.nextInt();

        //Inbuilt Method
        String s1 = Integer.toString(x);
        String s2 = "";
        s2 = s2.valueOf(x);

        //User defined method
        String s3 = "";
        s3 = s3 + x;

        System.out.println("Int to String: "+s1+", "+s2+", "+s3);
    }
}
