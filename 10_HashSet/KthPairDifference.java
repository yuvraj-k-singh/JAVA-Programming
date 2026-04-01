/*
WAP: Kth Pair Difference
Date: 01-Apr-2026
*/

import java.util.HashSet;

public class KthPairDifference {
    public static void main(String[] args){
        int[] arr = {3,1,4,1,5};
        int target = 2;

        int count = kDifference(arr, target);

        System.out.println("The total pair is: "+count);
    }

    private static int kDifference(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int x : arr){
            int rem = Math.abs(target-x);
            if(set.contains(rem)) count++;
            set.add(x);
        }
        return count;
    }
}
