/*
WAP: Selection Sort
Date: 27-Jan-2026
*/

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){ //n-1 passes
            int min = Integer.MAX_VALUE, minIndx = 0;
            for(int j=i; j<arr.length; j++){
                //find minimum element
                if(min > arr[j]){
                    min = arr[j];
                    minIndx = j;
                }
            }
            //swap element
            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
        }
    }

    public static void main(String[] args){
        int[] arr = {4,1,3,9,7};

        System.out.println("Array elements before: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("\nArray elements after: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}
