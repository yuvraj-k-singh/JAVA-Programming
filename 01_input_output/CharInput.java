/*
WAP: Character Input (Scanner)
Date: 06-Dec-2025
*/

import java.util.Scanner;

public class CharInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the character: ");
        //There is no scanner direct method to take char as input so we use charAt(0).
        char ch = sc.next().charAt(0);
        System.out.print("Value of character is: " + ch);
    }
}
