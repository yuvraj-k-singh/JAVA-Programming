/*
WAP: Recursive Binary Search
Date: 07-May-2026
*/

public class RecursiveBS {
    public static void main(String[] args){
        int[] arr = {-3,-1,0,3,4,6,7,8,11,34,234,566,676,696};
        int target = -1;

        int ans = recursiveBS(arr, target, 0, arr.length-1);

        if(ans == -1){
            System.out.print("The given target " + target + " is not present!");
        }else{
            System.out.print("The given target " + target + " is present at " + ans + " index!");
        }
    }

    public static int recursiveBS(int[] arr, int target, int low, int high){
        if(low>high){
            return -1;
        }

        int mid = low+(high-low)/2;

        if(arr[mid]==target){
            return mid;
        }else if(arr[mid] > target){
            return recursiveBS(arr, target, low,mid-1);
        }else return recursiveBS(arr, target, mid+1, high);
    }
}
