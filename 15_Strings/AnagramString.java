/*
WAP: Check Anagram String
Date: 04-Sep-2026
*/

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "anagram", s2 = "nagaram";

        boolean flag = checkAnagram(s1, s2);

        if(flag) System.out.println("Both given Strings are Anagram");
        else System.out.println("Both given Strings are not Anagram");
    }

    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int[] count = new int[26];
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for(int x: count){
            if(x != 0) return false;
        }
        return true;
    }
}
