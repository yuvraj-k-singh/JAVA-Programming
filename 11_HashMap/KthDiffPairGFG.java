/*
WAP: Kth Diff Pair GFG
Date: 02-Apr-2026
*/

import java.util.HashMap;

public class KthDiffPairGFG {
    public static void main(String[] args){
        int[] arr = {1, 4, 1, 4, 5};
        int target = 3;

        int count = diffPair(arr, target);

        System.out.println("The total pair with difference K is: "+count);
    }
    private static int diffPair(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x : arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        int count = 0;
        for(int x : map.keySet()){
            int rem1 = x - k;
            int rem2 = x + k;

            if(map.containsKey(rem1)){
                count += (map.get(rem1) * map.get(x));
            }
            if(map.containsKey(rem2)){
                count += (map.get(rem2) * map.get(x));
            }
        }
        return count/2;
    }
}
