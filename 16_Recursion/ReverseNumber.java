/*
WAP: Reverse Number
Date: 11-oct-2026
*/

public class ReverseNumber {
    public static void main(String[] args){
        int n = 123;
        int ans = reverse(n, 0);
        System.out.println("Reversed Number: "+ans);
    }

    public static int  reverse(int n, int rev){
        if(n == 0){
            return rev;
        }
        return reverse(n/10, rev*10 + (n%10));
    }
}
