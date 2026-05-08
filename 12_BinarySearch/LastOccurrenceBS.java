/*
WAP: Last Occurrence Binary Search
Date: 08-May-2026
*/

public class LastOccurrenceBS {
    public static void main(String[] args){
        int[] arr = {1,1,3,4,6,6,6,6,6,8,9};
        int target = 6;

        int ans = lastOccurrenceBS(arr, target);

        if(ans == -1){
            System.out.print("The given target " + target + " is not present!");
        }else{
            System.out.print("The given target " + target + " is present at " + ans + " index!");
        }
    }

    public static int lastOccurrenceBS(int[] arr, int target){
        int low = 0, high = arr.length-1, indx = -1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==target){
                indx = mid;
                low=mid+1;
            }else if(arr[mid] > target){
                high = mid-1;
            }else low = mid+1;
        }
        return indx;
    }
}
