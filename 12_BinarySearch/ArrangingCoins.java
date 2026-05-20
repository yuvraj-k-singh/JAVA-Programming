/*
WAP: Arranging Coins
Date: 20-May-2026
*/

public class ArrangingCoins {
    public static void main(String[] args){
        int n = 15;

        int ans = arrangeCoins(n);

        System.out.println("The total rows filled are: "+ans);
    }

    private static int arrangeCoins(int n){
        long low=0, high=n, ans=0;

        while(low<=high){
            long mid = low+(high-low)/2;
            long sum = (mid*(mid+1))/2;

            if(sum==n) return (int)mid;
            else if(sum > n){
                high = mid-1;
            }else{
                ans = mid;
                low = mid+1;
            }
        }
        return (int)ans;
    }
}
