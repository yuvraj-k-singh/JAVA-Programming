/*
WAP: Two sum Best Solution
Date: 01-Apr-2026
*/

import java.util.HashSet;

public class TwoSumBestSol {
    public static void main(String[] args){
        int[] arr = {1,3,6,2,3,5};
        int target = 15;

        boolean flag = twoSum(arr, target);

        if(flag) System.out.println("The given sum target "+target+" is present!");
        else System.out.println("The given sum target "+target+" is not present!");
    }

    private static boolean twoSum(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();

        for(int x : arr){
            int remaining = target - x;
            if(set.contains(remaining)) return true;
            set.add(x);
        }
        return false;
    }
}
