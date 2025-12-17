/*
WAP: Alphabet Triangle Type2
Date: 17-Dec-2025

A
B B
C C C
D D D D
E E E E E

*/

import java.util.Scanner;

public class AlphabetTriangleType2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
