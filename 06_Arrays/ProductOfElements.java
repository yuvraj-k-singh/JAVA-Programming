/*
WAP: Product Of Elements
Date: 03-Jan-2026
*/

import java.util.Scanner;

public class ProductOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int product = 1;

        System.out.println("\nEnter elements of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("\nElements of array: ");
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.printf("\nThe product of %d elements of array is: %d", n, product);
    }
}
