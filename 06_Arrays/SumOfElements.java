/*
WAP: Sum Of Elements
Date: 03-Jan-2026
*/

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int sum = 0;
        int[] arr = new int[n];

        System.out.println("\nEnter elements of array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("\nElements of array: ");
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
        System.out.print("\nThe sum of "+n+" elements of array is: "+sum);
    }
}
