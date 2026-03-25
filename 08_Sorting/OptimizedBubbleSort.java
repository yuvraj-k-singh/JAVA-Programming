/*
WAP: Bubble Sort Optimized
Date: 25-Mar-2026
*/

public class OptimizedBubbleSort {
    public static void main(String[] args){

        int[] arr = {5,3,-2,8,4,1};

        System.out.println("Array before sort: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        bubbleSortOpt(arr);

        System.out.println();
        System.out.println("\nArray after sort: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
    private static void bubbleSortOpt(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            int swap = 0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0) break;
        }
    }


}
