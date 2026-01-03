/*
WAP: Input Output Of Arrays
Date: 03-Jan-2026
*/

import java.util.Scanner;

public class InputOutputOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        //Taking user input
        System.out.println("Enter arrays elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter "+(i+1)+" element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArrays elements are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
