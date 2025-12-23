/*
WAP: Greet
Date: 23-Dec-2025
*/

import java.util.Scanner;

public class Greet {

    public static void greet(String name){
        System.out.print("Good morning!, "+name);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        greet(name);
    }
}
