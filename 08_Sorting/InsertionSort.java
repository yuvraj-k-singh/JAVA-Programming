/*
WAP: Insertion Sort
Date: 26-mar-2026
*/

public class InsertionSort {
    public static void main(String[] args){
        int[] arr = {1,4,6,3,2,6,-3,4};

        System.out.println("Array elements before: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.println("\nArray elements after: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    private static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
