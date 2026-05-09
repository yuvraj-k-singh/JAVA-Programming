/*
WAP: Peak Element Binary Search
Date: 09-May-2026
*/

public class PeakElementBS {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};

        int indx = peakElement(arr);

        if(indx==-1){
            System.out.print("The peak element is not available in the array!");
        }else System.out.print("The peak element is: "+indx);
    }

    public static int peakElement(int[] arr){
        int low=1, high=arr.length-2;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return arr[mid];
            }else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                low = mid+1;
            }else high = mid-1;
        }
        return -1;
    }
}
