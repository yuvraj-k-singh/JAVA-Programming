/*
WAP: Maximum Element
Date: 04-Jan-2026
*/

public class MaximumElement {
    public static void main(String[] args){
        int[] arr = {1,2,5,3,6,-6,9,29,48};
        int max = arr[0];

        System.out.println("Array elements are: ");
        for(int i=0; i<arr.length; i++){
            //max = Math.max(max,arr[i]);
            if(max<arr[i]) max = arr[i];
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("\nMaximum element: "+max);
    }
}
