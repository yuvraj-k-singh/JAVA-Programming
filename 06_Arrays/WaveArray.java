/*
WAP: Wave Array
Date: 09-Jan-2026
*/

public class WaveArray {
    public static void waveArray(int[] arr) {
        for(int i=0; i<arr.length - 1; i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println("Array elements before wave: ");
        for(int x : arr){
            System.out.print(x +" ");
        }

        waveArray(arr);

        System.out.println();
        System.out.println("\nArray elements after wave: ");
        for(int x : arr){
            System.out.print(x +" ");
        }
    }
}
