/*
WAP: Search In Rotated Array
Date: 21-May-2026
*/

public class SearchInRotatedArray {
    public static void main(String[] args){
        int[] arr = {4,5,6,7,8,1,2,3};
        int target = 9;

        int ans = searchRotated(arr, target);

        if(ans == -1) System.out.print("The given target "+target+" is not present!");
        else System.out.print("The given target "+target+" is present in index at "+ans);
    }

    private static int searchRotated(int[] arr, int k){
        int low=0, high=arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]==k) return mid;
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=k && k<=arr[mid]){
                    high = mid-1;
                }else low = mid+1;
            }else{
                if(arr[mid]<=k && k<=arr[high]){
                    low = mid+1;
                }else high = mid-1;
            }
        }
        return -1;
    }
}
