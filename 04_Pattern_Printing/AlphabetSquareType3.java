/*
WAP: Alphabet Square Type 3
Date: 16-Dec-2025

a a a a
B B B B
c c c c
D D D D

*/

import java.util.Scanner;

public class AlphabetSquareType3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%2==0){
                    System.out.print((char)(i+64)+" ");
                } else System.out.print((char)(i+96)+" ");
            }
            System.out.println();
        }
    }
}
