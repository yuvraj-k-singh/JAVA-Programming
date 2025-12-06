/*
WAP: User Input (Scanner)
Date: 06-Dec-2025
*/

import java.util.Scanner;                //Import scanner class

public class UserInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);      //Creating scanner object sc for multiple uses

        //1. Taking int as input
        System.out.println("Taking Input from users: ");
        System.out.print("Enter INT Value: ");
        int a = sc.nextInt();
        System.out.println("The value of INT: "+a);

        System.out.println();

        //2. Taking float as input
        System.out.print("Enter FLOAT value: ");
        float b = sc.nextFloat();
        System.out.print("The value of FLOAT: "+b);
    }
}
