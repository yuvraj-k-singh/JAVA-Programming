/*
WAP: First and Last Occurrence Binary Search
Date: 08-May-2026
*/

import java.util.ArrayList;

public class FirstandLastOccurrence {
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;

        ArrayList<Integer> ans = firstAndLast(arr, target);

        System.out.println("First and last Occurrence: ");
        for(int x : ans){
            System.out.print(x+" ");
        }
    }

    public static ArrayList<Integer> firstAndLast(int[] arr, int k){
        int first = firstOccurrence(arr, k);
        int last = lastOccurrence(arr, k);

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(last);
        return ans;
    }

    private static int firstOccurrence(int[] arr, int k){
        int low=0, high=arr.length-1, indx=-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == k){
                indx=mid;
                high = mid-1;
            }else if(arr[mid] > k){
                high = mid-1;
            }else low = mid+1;
        }
        return indx;
    }

    private static int lastOccurrence(int[] arr, int k){
        int low=0, high=arr.length-1, indx=-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == k){
                indx=mid;
                low = mid+1;
            }else if(arr[mid] > k){
                high = mid-1;
            }else low = mid+1;
        }
        return indx;
    }
}
