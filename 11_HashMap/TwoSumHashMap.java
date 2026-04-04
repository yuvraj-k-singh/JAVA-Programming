/*
WAP: Two Sum HashMap
Date: 04-Apr-2026
*/

import java.util.HashMap;

public class TwoSumHashMap {
    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int target = 9;

        boolean flag = twoSum(arr, target);

        if(flag) System.out.println("The given sum "+target+" is present!");
        else System.out.println("The given sum "+target+" is not present!");
    }

    private static boolean twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                return true;
            }
            map.put(arr[i], i);
        }
        return false;
    }
}
