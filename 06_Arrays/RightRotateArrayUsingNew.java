/*
WAP: Right Rotate Array Using New
Date: 09-Jan-2026
*/

import java.util.Scanner;

public class RightRotateArrayUsingNew {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int index = 0;
        int[] brr = new int[arr.length];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of K steps: ");
        int k = sc.nextInt();

        k = k%n; // to find k value

        System.out.println();
        System.out.println("Arrays element in Arr before right rotation: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        for(int i=n-k; i<n; i++){
            brr[index++] = arr[i];
        }

        for(int i=0; i<n-k; i++){
            brr[index++] = arr[i];
        }

        System.out.println();
        System.out.println("\nArrays element in Brr after right rotation: ");
        for(int x : brr){
            System.out.print(x+" ");
        }
    }
}

