/*
WAP: Maximum element Selection Sort
Date: 30-Jan-2026
*/
public class MaximumSelectionSort {
    public static void selectionSort(int[] arr){
        for(int i=arr.length-1; i>=1; i--){ //n-1 pass
            int max = Integer.MIN_VALUE, maxIndx = 0;
            for(int j=0; j<=i; j++){
                if(max < arr[j]){
                    max = arr[j];
                    maxIndx = j;
                }
            }
            //swap element
            int temp = arr[i];
            arr[i] = arr[maxIndx];
            arr[maxIndx] = temp;
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
