/*
WAP: Reverse Array Two Pointers
Date: 12-oct-2026
*/

public class ReverseArray {
    public static void main() {
        int[] arr = {1,2,3,4,5};

        reverse(arr, 0, arr.length-1);

        for(int x: arr){
            System.out.print(x + " ");
        }
    }

    public static void reverse(int[] arr, int i, int j){
        if(i>=j){
            return;
        }
        swap(arr, i, j);
        reverse(arr, i+1, j-1);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
