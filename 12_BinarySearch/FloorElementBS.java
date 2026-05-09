/*
WAP: Floor Element Binary Search
Date: 09-May-2026
*/

public class FloorElementBS {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 10, 10, 12, 19};
        int x = 5;

        int ans = floorElement(arr, x);

        if(ans == -1){
            System.out.print("The given target " + x + " floor value is not present!");
        }else{
            System.out.print("The given target " + x + " floor value is present at " + ans + " index!");
        }
    }

    public static int floorElement(int[] arr, int k){
        int low=0, high=arr.length-1, indx = -1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] > k){
                high = mid-1;
            }else{
                indx = mid;
                low = mid+1;
            }
        }
        return indx;
    }
}

