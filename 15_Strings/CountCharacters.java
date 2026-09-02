/*
WAP: Strings Count Characters
Date: 02-Sep-2026
*/

public class CountCharacters {
    public static void main(String[] args){
        String name = "Yuvraj";
        int cnt = 0;

        char[] ch = name.toCharArray();

        for(char x : ch){
            cnt++;
        }

        System.out.println("Total length of String: "+cnt);
    }
}
