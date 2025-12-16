/*
WAP: Alphabet Square Type 2
Date: 16-Dec-2025
*/


import java.util.Scanner;

public class AlphabetSquareType2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        char ch = 'A';

        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
    }
}
