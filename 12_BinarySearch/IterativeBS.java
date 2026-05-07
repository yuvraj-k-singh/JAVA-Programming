/*
WAP: Iterative Binary Search
Date: 07-May-2026
*/

public class IterativeBS {
    public static void main(String[] args){
        int[] arr = {-3,-1,0,3,4,6,7,8,11,34,234,566,676,696};
        int target = 999;

        int ans = iterativeBS(arr, target);

        if(ans == -1){
            System.out.print("The given target " + target + " is not present!");
        }else{
            System.out.print("The given target " + target + " is present at " + ans + " index!");
        }
    }

    public static int iterativeBS(int[] arr, int target){
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}
