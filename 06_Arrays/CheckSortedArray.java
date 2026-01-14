/*
WAP: Check Sorted Array
Date: 14-Jan-2026
*/

import java.util.Scanner;

public class CheckSortedArray {

    public static boolean checkSorted(int[] arr){
        for(int i=0; i<arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter array elements");
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        boolean flag = checkSorted(arr);

        System.out.println();
        if(flag) System.out.print("The given array is sorted!");
        else System.out.print("The given array is not sorted!");
    }
}
