/*
WAP: Count Vowels
Date: 23-july-2026
*/

public class CountVowels {
    public static void main(String[] args){
        String str = "Yuvraj Kumar Singh";
        int cnt = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') cnt++;
        }

        System.out.println("Number of vowels in String is: "+cnt);
    }
}
