/*
WAP: Distinct Elements
Date: 01-Apr-2026
*/

import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};

        int size = distinctElement(arr);

        System.out.println("The total distinct Elements: "+size);
    }

    public static int distinctElement(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int x : arr) set.add(x);
        return set.size();
    }
}
