/*
WAP: Print Negative Elements
Date: 03-Jan-2026
*/

import java.util.Scanner;

public class PrintNegativeElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter element of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("\nNegative elements of array: ");
        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0) System.out.print(arr[i] + " ");
        }
    }
}
