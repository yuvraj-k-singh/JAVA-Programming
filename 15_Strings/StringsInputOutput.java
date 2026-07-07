/*
WAP: Strings Input Output
Date: 07-july-2026
*/

import java.util.Scanner;

public class StringsInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String name = sc.next();

        sc.nextLine();

        System.out.println("Enter short bio: ");
        String bio = sc.nextLine();

        System.out.println("\nFirst Name: "+name);
        System.out.println("Short Bio: \n"+bio);
    }
}
