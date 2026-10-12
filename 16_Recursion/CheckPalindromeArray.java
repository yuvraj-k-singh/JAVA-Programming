/*
WAP: Check Palindrome Array
Date: 12-oct-2026
*/

public class CheckPalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,1};

        boolean flag = checkPalindrome(arr, 0, arr.length-1);

        if(flag) System.out.println("Given array is Palindrome");
        else System.out.println("Given array is not Palindrome");
    }

    public static boolean checkPalindrome(int[] arr, int i, int j){
        if(i >= j) {
            return true;
        }
        if(arr[i] != arr[j]){
            return false;
        }
        return checkPalindrome(arr, i+1, j-1);
    }
}
