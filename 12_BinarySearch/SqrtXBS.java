/*
WAP: Square Root X Binary Search
Date: 09-May-2026
*/

public class SqrtXBS {
    public static void main(String[] args) {
        int n = 16;

        int ans = sqrt(n);

        System.out.println("The square root of "+n+" is: "+ans);
    }

    public static int sqrt(int n){
        int low=1, high=n;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(mid == n/mid) return mid;
            else if(mid > n/mid) high = mid-1;
            else low = mid+1;
        }
        return high;
    }
}
