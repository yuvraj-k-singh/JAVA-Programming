/*
WAP: Move Zeroes End
Date: 27-Jan-2026
*/

public class MoveZeroesEnd {
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1,0,2,0,0,6,4,3};

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
