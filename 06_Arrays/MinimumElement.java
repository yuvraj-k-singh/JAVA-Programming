/*
WAP: Minimum Element
Date: 04-Jan-2026
*/

public class MinimumElement {
    public static void main(String[] args){
        int[] arr = {1,2,5,6,7,-3,-4};
        int min = arr[0];

        System.out.println("Array elements are: ");
        for(int i=0; i<arr.length; i++){
            //min = Math.min(min,arr[i]);
            if(min>arr[i]) min = arr[i];
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("\nMinimum element: "+min);
    }
}
