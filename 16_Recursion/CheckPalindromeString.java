/*
WAP: Check Palindrome String
Date: 12-oct-2026
*/

public class CheckPalindromeString {
    public static void main(String[] args) {
        String str = "naman";

        boolean flag = checkPalindrome(str, 0, str.length()-1);

        if(flag) System.out.println("Given String is Palindrome");
        else System.out.println("Given String is not Palindrome");
    }

    public static boolean checkPalindrome(String s, int i, int j){
        if(i >= j) {
            return true;
        }
        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
        return checkPalindrome(s, i+1, j-1);
    }
}
