/*
WAP: Is Palindrome
Date: 23-july-2026
*/

public class IsPalindrome {
    public static void main(String[] args){
        String str = "racecar";

        boolean flag = isPalindrome(str);

        if(flag) System.out.println("Given string is palindrome");
        else System.out.println("Given string is not palindrome");
    }

    public static boolean isPalindrome(String s){
        int i=0, j=s.length()-1;

        while(i<=j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
