/*
WAP: Modify String Based On First Char
Date: 02-Sep-2026
*/

public class ModifyStringBasedOnFirstCh {
    public static void main(String[] args) {
        String str = "PaBhdD";

        String s = modifyString(str);
        System.out.println("Modified String: "+s);
    }

    public static String modifyString(String s){
        char ch = s.charAt(0);

        return ((int)ch>=65 && (int)ch<=90) ? s.toUpperCase() : s.toLowerCase();
    }
}
