/*
WAP: Two sum GFG
Date: 30-Jan-2026
*/

import java.util.Arrays;

public class TwoSumGFG {
    public static boolean twoSum(int[] arr, int target){
        Arrays.sort(arr);
        int i=0, j=arr.length-1;
        while(i<j){
            if(arr[i] + arr[j] == target) return true;
            else if(arr[i] + arr[j] < target) i++;
            else j--;
        }
        return false;
    }


    public static void main(String[] args){
        int[] arr = {0, -1, 2, -3, 1};
        int target = 2;

        System.out.println("Array elements before: ");
        for(int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();

        boolean flag = twoSum(arr, target);

        if(flag) System.out.print("\nTarget "+target+" is present!");
        else System.out.print("\nTarget "+target+" is not present!");
    }
}
