/*
WAP: Plus One
Date: 24-Jan-2026
*/

import java.util.ArrayList;
import java.util.Collections;

public class PlusOne {
    public static ArrayList<Integer> plusOne(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int carry = 1;

        for(int i=arr.length-1; i>=0; i--){
            if(carry==0){
                ans.add(arr[i]);
            }else if(arr[i] < 9){
                ans.add(arr[i] + carry);
                carry = 0;
            }else{
                ans.add(0);
                carry = 1;
            }
        }
        if(carry==1) ans.add(1);
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args){
        int[] arr = {9,0,9};

        System.out.println("Array element before: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        ArrayList<Integer> ans = plusOne(arr);
        System.out.println();
        System.out.println("\nArray elements after: ");
        for(int x : ans){
            System.out.print(x+" ");
        }
    }
}
