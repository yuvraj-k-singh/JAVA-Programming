/*
WAP: Check vowels or consonant
Date: 13-Dec-2025
*/

import java.util.Scanner;

public class VowelsConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);

        if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.print("The given character "+ch+" is Vowels!");
        } else System.out.print("The given character "+ch+" is Consonant!");
    }
}
