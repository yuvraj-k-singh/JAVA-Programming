/*
WAP: Passing Array To Method
Date: 04-Jan-2026
*/

import java.util.Scanner;

public class PassingArrayToMethod {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter array elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("\nBefore updating Element: " +arr[2]);
        change(arr);
        System.out.print("After updating Element: " +arr[2]);
    }

     public static void change(int[] arr) {
        arr[2] = 80;
    }
}
