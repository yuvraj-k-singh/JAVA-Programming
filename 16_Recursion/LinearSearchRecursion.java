/*
WAP: Linear Search Recursion
Date: 16-oct-2026
*/

public class LinearSearchRecursion {
    public static void main(String[] args){
        int[] arr = {5,6,4,2,4,6,6,3,1};
        boolean flag = linearSearch(arr, 4, 0);
        if(flag) System.out.println("The given element is present!");
        else System.out.println("The given element is not present!");
    }
    public static boolean linearSearch(int[] arr, int x, int i) {
        int n = arr.length;
        if(i == n){
            return false;
        }
        if(arr[i] == x){
            return true;
        }
        return linearSearch(arr, x, i+1);
    }
}
