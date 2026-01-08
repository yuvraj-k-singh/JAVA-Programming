/*
WAP: Reverse Array
Date: 08-Jan-2026
*/

public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Original Array elements are: ");
        for(int x : arr) System.out.print(x + " ");

        //reversed logic
        for(int i=0, j = arr.length-1; i<j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println();
        System.out.println("\nReversed Arrays elements are: ");
        for(int x : arr) System.out.print(x + " ");
    }
}
