/*
WAP: Odd Numbers Divisible By 3
Date: 12-Dec-2025
*/

import java.util.Scanner;

public class OddNumbersDivisibleBy3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n numbers: ");
        int n = sc.nextInt();

        System.out.println("\nOdd numbers divisible by 3 from 1 to "+n+" is: ");
        for(int i=1; i<=n; i++){
            if(i%2 != 0 && i%3==0){
                System.out.print(i+" ");
            }
        }
    }
}
