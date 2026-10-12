/*
WAP: Reverse Array Single Pointers
Date: 12-oct-2026
*/

public class ReverseArraySinglePointer {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reverse(arr, 0);

        for(int x: arr)

        {
            System.out.print(x + " ");
        }
    }

    public static void reverse(int[] arr, int i){
        int n = arr.length;

        if(i >= n/2){
            return;
        }
        swap(arr, i, n-1-i);
        reverse(arr, i+1);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
