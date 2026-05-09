/*
WAP: Search In Descending Order Binary Search
Date: 09-May-2026
*/

public class SearchInDescendingOrderBS {
    public static void main(String[] args) {
        int[] arr = {100,98,92,78,66,62,59,57,45,43,22,10,4,2,1};
        int target = 1000;

        int indx = searchDescendingBs(arr, target);

        if(indx == -1)
            System.out.print("The given target "+target+" is not present in list!");
        else
            System.out.print("The given target "+target+" is present at index "+indx);
    }

    public static int searchDescendingBs(int[] arr, int target){
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                low = mid+1;
            }else high = mid-1;
        }
        return -1;
    }
}
