/*
WAP: Reverse String
Date: 03-Sep-2026
*/

public class ReverseString {
    public static void main(String[] args) {
        String str = "Yuvraj";

        String reverse = reverseString(str);
        System.out.println("Reversed String: "+reverse);
    }

    public static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = sb.length()-1;

        while(i<=j){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);
            sb.setCharAt(i, ch2);
            sb.setCharAt(j, ch1);
            i++;
            j--;
        }
        return sb.toString();
    }
}
