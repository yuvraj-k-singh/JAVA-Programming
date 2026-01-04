/*
WAP: Shallow And Deep Copy
Date: 04-Jan-2026
*/

import java.util.Arrays;

public class ShallowAndDeepCopy {
    public static void main(String[] args){
        int[] arr = {3,4,5,7,2,3};

        //shallow copy
        System.out.println("Shallow copy: ");
        int[] brr = arr;
        System.out.println("Arr 0 index element: "+arr[0]);
        brr[0] = 5;
        System.out.println("Arr (new) 0 index element: "+arr[0]);

        System.out.println();
        //deep copy
        System.out.println("Deep copy: ");
        int[] crr = Arrays.copyOf(arr, arr.length);
        crr[0] = 6;
        System.out.println("Crr 0 index element: "+crr[0]);
        System.out.println("Arr 0 index element: "+arr[0]);
    }
}
