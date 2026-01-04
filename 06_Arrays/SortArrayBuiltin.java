/*
WAP: Sort Array Builtin
Date: 04-Jan-2026
*/

import java.util.Arrays;

public class SortArrayBuiltin {
    public static void main(String[] args){
        int[] arr = {28,2,3,5,6};

        System.out.println("Array elements before sort: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);

        System.out.println();
        System.out.println("\nArray elements after sort: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
