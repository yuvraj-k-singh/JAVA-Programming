/*
WAP: Left Rotate Array Using New
Date: 09-Jan-2026
*/

import java.util.Scanner;

public class LeftRotateArrayUsingNew {
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
        System.out.println("Arrays element in Arr before left rotation: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        for(int i=k; i<n; i++){
            brr[index++] = arr[i];
        }

        for(int i=0; i<k; i++){
            brr[index++] = arr[i];
        }

        System.out.println();
        System.out.println("\nArrays element in Brr after left rotation: ");
        for(int x : brr){
            System.out.print(x+" ");
        }
    }
}
