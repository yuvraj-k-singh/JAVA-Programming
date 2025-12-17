/*
WAP: Alphabet Square
Date: 16-Dec-2025

A B C D
A B C D
A B C D
A B C D

*/

import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        char ch;

        System.out.println();
        for(int i=1; i<=n; i++){
            ch = 'A';
            for(int j=1; j<=n; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
