/*
WAP: Bubble Sort Descending
Date: 27-Jan-2026
*/

public class BubbleSortDescending {
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {4,2,2,5,6,1,7};

        System.out.println("Array elements before: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("\nArray elements after: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
