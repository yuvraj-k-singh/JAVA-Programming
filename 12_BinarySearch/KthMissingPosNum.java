/*
WAP: Kth Missing Positive Number
Date: 21-May-2026
*/

public class KthMissingPosNum {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;

        int ans = missingNum(arr, k);

        System.out.print("The missing kth positive number is: "+ans);
    }

    private static int missingNum(int[] arr, int k){
        int low=0, high=arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            int correctNo = mid+1;
            int missing = arr[mid] - correctNo;

            if(missing>=k) high = mid-1;
            else low = mid+1;
        }
        return (low+k);
    }
}
