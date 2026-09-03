/*
WAP: String to Character Array
Date: 03-Sep-2026
*/

public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Yuvraj";

        char[] ch = stringToChar(s);

        for(char c : ch){
            System.out.print(c+" ");
        }
    }

    public static char[] stringToChar(String s){
        char[] ch = new char[s.length()];
        //char[] ch = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            ch[i] = s.charAt(i);
        }
        return ch;
    }
}
