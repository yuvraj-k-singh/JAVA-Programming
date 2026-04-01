/*
WAP: Missing elements in range
Date: 01-Apr-2026
*/

import java.util.HashSet;
import java.util.ArrayList;

public class MissingElementRange {
    public static void main(String[] args){
        int[] arr = {1, 4, 11, 51, 52, 15};
        int low = 50, high = 55;

        ArrayList<Integer> ans= missingElementRange(arr, low, high);

        System.out.println("The missing elements: ");
        for(int x : ans) System.out.print(x+" ");
    }
    public static ArrayList<Integer> missingElementRange(int[] arr, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int x : arr) set.add(x);

        for(int i=low; i<=high; i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}
