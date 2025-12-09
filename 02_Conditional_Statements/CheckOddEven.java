/*
WAP: Check Odd Even
Date: 09-Dec-2025
*/

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.print("The given number " + n + " is even!");
        }else {
            System.out.print("The given number " + n + " is odd!");
        }
    }
}
