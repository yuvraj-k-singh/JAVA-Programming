/*
WAP: Merge Two Sorted Arrays
Date: 14-Jan-2026
*/

public class MergeTwoSortedArrays {
    public static int[] mergeArrays(int[] arr, int[] brr){
        int i=0, j=0, k=0;
        int[] crr = new int[arr.length + brr.length];


        while(i<arr.length && j<brr.length){
            if(arr[i] < brr[j]) {
                crr[k++] = arr[i];
                i++;
            } else{
                crr[k++] = brr[j];
                j++;
            }
        }

        //check if arr is finished then, add elements of brr in crr
        while(j<brr.length){
            crr[k++] = brr[j++];
        }

        //check if brr is finished, then add elements of arr in crr
        while(i<arr.length){
            crr[k++] = arr[i++];
        }

        return crr;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        int[] brr = {2,5,6};

        int[] res = mergeArrays(arr, brr);

        System.out.println("Merged array elements are: ");
        for(int x : res){
            System.out.print(x + " ");
        }
    }
}
