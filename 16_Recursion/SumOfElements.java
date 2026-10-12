/*
WAP: Sum Of Array Elements
Date: 12-oct-2026
*/

public class SumOfElements {
    public static void main() {
        int[] arr = {1,2,3,4,5};

        int ans = sum(arr, arr.length-1);
        System.out.println("Sum: "+ans);
    }

    public static int sum(int[] arr, int n){
        if(n < 0){
            return 0;
        }
        return arr[n] + sum(arr, n-1);
    }

}
