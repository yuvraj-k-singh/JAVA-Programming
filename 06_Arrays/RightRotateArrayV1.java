/*
WAP: Right Rotate Array V1
Date: 09-Jan-2026
*/

import java.util.Scanner;

public class RightRotateArrayV1 {

    public static void rev(int[] arr, int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of K steps: ");
        int k = sc.nextInt();

        k = k%n; // to find k value

        System.out.println();
        System.out.println("Arrays element before right rotation: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        rev(arr, 0, n-1);
        rev(arr, 0, k-1);
        rev(arr, k, n-1);

        System.out.println();
        System.out.println("\nArrays element after right rotation: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
