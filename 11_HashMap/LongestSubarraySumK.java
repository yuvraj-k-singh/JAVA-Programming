/*
WAP: Longest Subarray Sum K HashMap
Date: 04-Apr-2026
*/

import java.util.HashMap;

public class LongestSubarraySumK {
    public static void main(String[] args){
        int[] arr = {10, -10, 20, 30};
        int target = 5;

        int maxLen = longestSubarray(arr, target);

        System.out.println("The maximum length subarray is: "+maxLen);
    }

    public static int longestSubarray(int[] arr, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(sum == k) maxLen = i+1;
            if(map.containsKey(sum-k)){
                maxLen = Math.max(maxLen, (i-map.get(sum-k)));
            }
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        return maxLen;
    }
}
