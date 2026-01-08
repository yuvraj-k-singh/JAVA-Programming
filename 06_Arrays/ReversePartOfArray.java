/*
WAP: Reverse Part of Array
Date: 08-Jan-2026
*/

public class ReversePartOfArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println("Original Array elements are: ");
        for(int x : arr) System.out.print(x + " ");

        //Reverse logic
        int i = 2, j=5;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println();
        System.out.println("\nReverse Array elements are: ");
        for(int x : arr) System.out.print(x + " ");
    }
}
